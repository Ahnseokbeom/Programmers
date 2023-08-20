package programmers;

import java.util.Arrays;

public class PRO_3_BestSet {
	public static void main(String[] args) {
		int n1 = 2;
		int s1 = 9;
		System.out.println(Arrays.toString(solution(n1,s1)));

		int n2 = 2;
		int s2 = 1;
		System.out.println(Arrays.toString(solution(n2,s2)));

		int n3 = 2;
		int s3 = 8;
		System.out.println(Arrays.toString(solution(n3,s3)));
	}
	public static int[] solution(int n, int s) {
		if(n > s)
	          return new int[]{-1};

		int[] answer = new int[n];
		for(int i=0; i<answer.length; i++) answer[i] = s/n;

		for(int i=0; i<s%n; i++) answer[i]++;

		Arrays.sort(answer);
		return answer;
    }
}
