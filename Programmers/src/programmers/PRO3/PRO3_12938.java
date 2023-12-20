package programmers.PRO3;

import java.util.Arrays;

public class PRO3_12938 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(2,9)));
		System.out.println(Arrays.toString(solution(2,1)));
		System.out.println(Arrays.toString(solution(2,8)));
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
