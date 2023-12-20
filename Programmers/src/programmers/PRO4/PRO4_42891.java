package programmers.PRO4;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PRO4_42891 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,1,2}, 5));
		System.out.println(solution(new int[] {3,1,2}, 4));
		System.out.println(solution(new int[] {3,1,2}, 7));
	}
	public static class Food {
	    int time;
	    int idx;

	    public Food(int time, int idx) {
	        this.time = time;
	        this.idx = idx;
	    }
	}
	public static int solution(int[] food_times, long k) {
        int n = food_times.length;
        long sum = 0;
        PriorityQueue<Food> pq = new PriorityQueue<>((a, b) -> a.time - b.time);

        for (int i = 0; i < n; i++) {
            sum += food_times[i];
            pq.offer(new Food(food_times[i], i + 1));
        }

        if (sum <= k) return -1;

        long prev = 0;
        long current = 0;

        while (k >= (pq.peek().time - prev) * n) {
            current = pq.poll().time;
            k -= (current - prev) * n;
            n--;
            prev = current;
        }

        Food[] rest = new Food[n];
        int idx = 0;

        while (!pq.isEmpty()) {
            rest[idx++] = pq.poll();
        }

        Arrays.sort(rest, (a, b) -> a.idx - b.idx);
        int answer = rest[(int) (k % n)].idx;
        return answer;
    }
}
