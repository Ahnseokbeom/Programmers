package programmers.PRO1;

import java.util.Arrays;

public class PRO1_142086 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("banana")));
		System.out.println(Arrays.toString(solution("foobar")));
	}
	public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        char c;
        for(int i = 1;i<s.length();i++) {
			c = s.charAt(i);
			for(int j = i-1;j>=0;j--) {
				if(c==s.charAt(j)) {
					answer[i] = i-j;
					break;
				}
				answer[i] = -1;
			}
		}
        return answer;
	}
}
