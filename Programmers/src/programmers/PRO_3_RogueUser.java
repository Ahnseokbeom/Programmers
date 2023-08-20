package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class PRO_3_RogueUser {
	static HashSet<String> set;
	static String[] regex;
	static boolean[] check;
	public static void main(String[] args) {
		String[] user1 = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] banned1 = {"fr*d*", "abc1**"};
		System.out.println(solution(user1,banned1));

		String[] user2 = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] banned2 = {"*rodo", "*rodo", "******"};
		System.out.println(solution(user2,banned2));

		String[] user3 = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] banned3 = {"fr*d*", "*rodo", "******", "******"};
		System.out.println(solution(user3,banned3));
	}
	public static int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        set = new HashSet<>();
        regex = new String[banned_id.length];
        for(int i = 0;i<banned_id.length;i++) regex[i] = banned_id[i].replace("*", ".");
        check = new boolean[user_id.length];
        backtracking(0, "", user_id);
        answer = set.size();
        return answer;
    }
	public static void backtracking(int idx, String res, String[] user_id) {
		if(idx == regex.length) {
			String[] str = res.split(" ");
			Arrays.sort(str);
			String newStr = "";
			for(int i = 0;i<str.length;i++) {
				newStr +=str[i];
			}
			set.add(newStr);
			return;
		}
		for(int i = 0;i<user_id.length;i++) {
			if(!check[i]&&user_id[i].matches(regex[idx])) {
				check[i] = true;
				backtracking(idx+1, res+" "+user_id[i], user_id);
				check[i] = false;
			}
		}
	}

}
