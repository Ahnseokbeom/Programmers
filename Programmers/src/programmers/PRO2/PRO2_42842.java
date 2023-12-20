package programmers.PRO2;

import java.util.Arrays;

public class PRO2_42842 {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(10, 2)));
		System.out.println(Arrays.toString(solution(8, 1)));
		System.out.println(Arrays.toString(solution(24, 24)));
	}
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        for(int i = 3;i<sum;i++) {
			int j = sum/i;
			if(sum%i==0 && j>=3) {
				int col = Math.max(i, j);
				int low = Math.min(i, j);
				int center = (col-2) * (low-2);
				if(center==yellow) {
					answer[0] = col;
					answer[1] = low;
					return answer;
				}
			}
		}
        return answer;
    }
}
