package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PRO_3_ToothBrushSale {
	static Map<String, Integer> map1 = new HashMap<>();
	static Map<String, String> map2 = new HashMap<>();
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"},
				new String[] {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"},
				new String[] {"young", "john", "tod", "emily", "mary"},
				new int[] {12,4,2,5,10})));

		System.out.println(Arrays.toString(solution(new String[] {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"},
				new String[] {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"},
				new String[] {"sam", "emily", "jaimie", "edward"},
				new int[] {2,3,5,4})));

	}
	public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        for(int i = 0;i<enroll.length;i++) {
        	map1.put(enroll[i], 0);
        	map2.put(enroll[i], referral[i]);
        }
        for(int i = 0;i<seller.length;i++) dfs(seller[i],amount[i]*100);
        for(int i = 0;i<enroll.length;i++) answer[i] = map1.get(enroll[i]);
        return answer;
    }
	public static void dfs(String name, int money) {
		if(name.equals("-") || money == 0) return;

		int m1 = (int)(Math.ceil(money*0.9));
		int m2 = money - m1;
		String next = map2.get(name);
		map1.replace(name, map1.get(name)+m1);
		dfs(next,m2);
	}
}
