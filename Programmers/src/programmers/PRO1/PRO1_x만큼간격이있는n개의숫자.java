package programmers.PRO1;

import java.util.Arrays;

public class PRO1_x만큼간격이있는n개의숫자 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(2, 5)));
		System.out.println(Arrays.toString(solution(4, 3)));
		System.out.println(Arrays.toString(solution(-4, 2)));
	}
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(long i = 1;i<=n;i++){
            answer[(int) (i-1)] = x*i;
        }
        return answer;
    }
}
