package programmers.PRO2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PRO2_최솟값만들기 {
	public static void main(String[] args) {
		
		System.out.println(solution(new int[]{1,4,2}, new int[] {5,4,4}));
		System.out.println(solution(new int[] {1,2}, new int[] {3,4}));
	}
    public static int solution(int []A, int []B){
        int answer = 0;
        ArrayList<Integer> b = new ArrayList<>();
		for(int i = 0;i<B.length;i++) {
			b.add(B[i]);
		}
		Arrays.sort(A);
		Collections.sort(b,Collections.reverseOrder());
		for(int i = 0;i<A.length;i++) {
			answer+=A[i]*b.get(i);
		}
        return answer;
    }
}
