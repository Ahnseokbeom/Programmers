package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class PRO_2_MaxNumber {
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
	public static void main(String[] args) {
		int[] numbers1 = {6,10,2};
		int[] numbers2 = {3,30,34,5,9};
		System.out.println(solution(numbers1));
		System.out.println(solution(numbers2));
	}
}
