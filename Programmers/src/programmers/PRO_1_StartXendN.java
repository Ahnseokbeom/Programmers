package programmers;

import java.util.Arrays;

public class PRO_1_StartXendN {
	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        for(long i = 1;i<=n;i++){
	            answer[(int) (i-1)] = x*i;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int n = 2;
		long[] a = new long[n];
		int x = -4;

        for(int i = 1;i<=n;i++){
            a[i-1] = x*i;
        }
        System.out.println(Arrays.toString(a));
	}

}
