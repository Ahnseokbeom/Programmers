package programmers.PRO2;

import java.util.Arrays;
import java.util.Stack;

public class PRO2_42584 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1,2,3,2,3})));
	}
	// stack 정답
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> stack = new Stack<>();
		for(int i = 0;i<prices.length;i++) {
			while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
				answer[stack.peek()] = i - stack.peek();
				stack.pop();
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			answer[stack.peek()] = prices.length - stack.peek() - 1;
			stack.pop();
		}
		return answer;
	}
	// 이중 for문 시간초과
	public static int[] fail(int[] prices) {
		int[] answer = new int[prices.length];
		for(int i = 0;i<prices.length;i++) {
			for(int j = i+1;j<prices.length;j++) {
				if(prices[i]<=prices[j]) answer[i]++;
			}
		}
		return answer;
	}
}
