package programmers.PRO2;

import java.util.Arrays;

public class PRO2_이진변환반복하기 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("110010101001")));
		System.out.println(Arrays.toString(solution("01110")));
		System.out.println(Arrays.toString(solution("1111111")));
	}
	public static int[] solution(String s) {
        int[] answer = new int[2];
        while(s.length()>1) {
			int count = 0;
			for(int i = 0;i<s.length();i++) {
				if(s.charAt(i) == '0') answer[1]++;
				else count++;
			}
			s = Integer.toBinaryString(count);
			answer[0]++;
		}
        return answer;
    }
}
