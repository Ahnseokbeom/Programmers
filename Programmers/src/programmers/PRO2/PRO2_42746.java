package programmers.PRO2;

import java.util.Arrays;
import java.util.Comparator;

public class PRO2_가장큰수 {
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {6,10,2}));
		System.out.println(solution(new int[] {3,30,34,5,9}));
	}
	public static String solution(int[] numbers) {
		String answer = "";
		String[] s = new String[numbers.length];
		for(int i = 0;i<s.length;i++)s[i] = String.valueOf(numbers[i]);
		Arrays.sort(s,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
		});

		for(String st : s) answer+=st;
		if(s[0].equals("0")) answer = "0";

		return answer;
	}
}
