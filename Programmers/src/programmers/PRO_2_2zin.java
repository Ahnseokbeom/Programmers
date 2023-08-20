package programmers;

import java.util.Arrays;

public class PRO_2_2zin {
	public static void main(String[] args) {
		String s = "110010101001";
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
		System.out.println(Arrays.toString(answer));
	}

}
