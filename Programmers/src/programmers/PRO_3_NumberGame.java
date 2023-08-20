package programmers;

import java.util.Arrays;

public class PRO_3_NumberGame {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {5,1,3,7}, new int[] {2,2,6,8}));
		System.out.println(solution(new int[] {2,2,2,2}, new int[] {1,1,1,1}));
	}
	public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0;
        int b = 0;
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[a] > B[b]) {
                b++;
            } else if (A[a] == B[b]) {
                b++;
            } else {
                a++;
                b++;
                answer++;
            }
        }
        return answer;
    }
}
