package programmers;

import java.util.PriorityQueue;

public class PRO_2_DefenseGame {
	public static void main(String[] args) {
		int n1 = 7;
		int k1 = 3;
		int[] e1 = {4,2,4,5,3,3,1};
		System.out.println(solution(n1, k1, e1));

		int n2 = 2;
		int k2 = 4;
		int[] e2 = {3,3,3,3};
		System.out.println(solution(n2, k2, e2));
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
