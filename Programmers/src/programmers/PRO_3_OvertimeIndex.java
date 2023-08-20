package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class PRO_3_OvertimeIndex {
	public static void main(String[] args) {
		System.out.println(solution(4, new int[] {4,3,3}));
		System.out.println(solution(1, new int[] {2,1,2}));
		System.out.println(solution(3, new int[] {1,1}));
	}
	public static long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i : works) pq.offer(i);

		while(n-->0) {
			int max = pq.poll();
			if(max <= 0) break;
			pq.offer(max-1);
		}
		long answer = 0;
		while(!pq.isEmpty()) {
			answer+=Math.pow(pq.poll(), 2);
		}
        return answer;
    }
}
