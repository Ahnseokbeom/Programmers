package programmers.PRO2;

import java.util.PriorityQueue;

public class PRO2_디펜스게임 {
	public static void main(String[] args) {

		System.out.println(solution(7,4,new int[] {4,2,4,5,3,3,1}));
		System.out.println(solution(2,4,new int[] {3,3,3,3}));
	}
	public static int solution(int n, int k, int[] ememy) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int answer = ememy.length;
		for(int i = 0;i<ememy.length;i++) {
			pq.offer(ememy[i]);
			if(pq.size()>k) n-=pq.poll();
			if(n<0) return i;
		}
		return answer;
	}
}
