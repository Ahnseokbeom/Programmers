package programmers.PRO2;

import java.util.Arrays;

public class PRO2_87390 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(3, 2, 5)));
		System.out.println(Arrays.toString(solution(4, 7, 14)));
	}
	public static int[] solution(int n, long left, long right) {
		int[] answer = new int[(int)(right-left)+1];

		int num = 0;
		for(long i = left;i<=right;i++) {
			long row = i/n;
			long col = i%n;
			answer[num++] = Math.max((int)row, (int)col)+1;
		}
		return answer;
	}

}
