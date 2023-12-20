package programmers.PRO1;

import java.util.Arrays;

public class PRO1_12940 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(3, 12)));
		System.out.println(Arrays.toString(solution(2, 5)));
	}
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD(n,m);
        answer[1] = LCM(n,m);
        return answer;
    }
	public static int GCD(int a, int b) {
		while(a!=0) {
			int n = b%a;
			b = a;
			a = n;
		}
		return b;
	}
	public static int LCM(int a, int b) {
		int n = GCD(a,b);
		if(n==1) {
			return a*b;
		}
		return GCD(a,b)*b/a;
	}
}
