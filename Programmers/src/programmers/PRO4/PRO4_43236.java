package programmers.PRO4;

import java.util.Arrays;

public class PRO4_43236 {
	public static void main(String[] args) {
		System.out.println(solution(25, new int[] {2,14,11,21,17}, 2));
	}
	public static int solution(int distance, int[] rocks, int n) {
		int answer = 0;
		Arrays.sort(rocks);
		int left = 1;
		int right = distance;
		while(left <= right) {
			int mid = (left+right)/2;
			int remove = 0;
			int hit = 0;
			for(int i = 0;i<rocks.length;i++) {
				if(rocks[i] - remove < mid) hit++;
				else remove = rocks[i];
			}
			if(hit > n) right = mid-1;
			else left = mid+1;
			answer = right;
		}
		return answer;
	}
}
