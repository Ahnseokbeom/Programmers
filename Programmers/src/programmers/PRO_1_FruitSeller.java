package programmers;

import java.util.Arrays;
import java.util.Collections;

public class PRO_1_FruitSeller {
	public static void main(String[] args) {
		int k1 = 3;
		int m1 = 4;
		int[] score1 = {1,2,3,1,2,3,1};
		System.out.println(solution(k1, m1, score1));

		int k2 = 4;
		int m2 = 3;
		int[] score2 = {4,1,2,2,4,4,4,4,1,2,4,2};
		System.out.println(solution(k2, m2, score2));
	}
	public static int solution(int k, int m,int[] score) {
		int answer = 0;
		Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i = 0;i<arr.length;i++) {
			if((i+1)%m==0) answer += arr[i]*m;
		}
		return answer;
	}

}
