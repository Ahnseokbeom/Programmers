package programmers;

public class PRO_1_TwoPassword {
	public static void main(String[] args) {
		System.out.println(solution("aukks","wbqd",5));
	}
	// 97 ~ 122
	public static String solution(String s, String skip, int index) {
		String answer = "";
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			int count = 0;
			while(count<index) {
				++c;
				if(c > 'z') c-=26;
				if(skip.contains(c+"")) continue;
				else count++;
			}
			answer +=c;
		}

		return answer;
	}

}
