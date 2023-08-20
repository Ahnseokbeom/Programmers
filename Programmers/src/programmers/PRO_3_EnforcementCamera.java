package programmers;

import java.util.Arrays;

public class PRO_3_EnforcementCamera {
	public static void main(String[] args) {
		int[][] routes = {{-20,-15},{-14,-5},{-18,-13},{-5,-3}};
		System.out.println(solution(routes));
	}
	public static int solution(int[][] routes) {
		Arrays.sort(routes,(a,b)->Integer.compare(a[1], b[1]));
		int answer = 0;

		int min = Integer.MIN_VALUE;
		for(int[] route : routes) {
			if(min < route[0]) {
				min = route[1];
				answer++;
			}
		}
		return answer;
	}

}
