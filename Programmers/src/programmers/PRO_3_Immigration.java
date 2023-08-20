package programmers;

import java.util.Arrays;

public class PRO_3_Immigration {
	public static void main(String[] args) {
		System.out.println(solution(6, new int[] {7,10}));
		System.out.println(solution(200000, new int[]{3,10,6,29,10,4,5}));
	}
	public static long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        Arrays.sort(times);
        long left = times[0];
        long right = (long)times[times.length-1]*(long)n;
        long sum = 0;
        while(left<=right) {
        	long mid = (left+right)/2;
        	sum = 0;
        	for(int time : times) sum+=mid/time;
        	if(sum >= n) {
        		answer = Math.min(answer, mid);
        		right = mid-1;
        	}else left = mid+1;
        }
        return answer;
    }
}
