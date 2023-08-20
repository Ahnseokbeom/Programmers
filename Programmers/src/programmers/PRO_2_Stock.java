package programmers;

import java.util.Arrays;
import java.util.Stack;

public class PRO_2_Stock {
	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		int[] result = new int[prices.length];
		int[] answer = new int[prices.length];
		for(int i = 0;i<prices.length;i++) {
			for(int j = i+1;j<prices.length;j++) {
				if(prices[i]<=prices[j]) result[i]++;
			}
		}
		// 이중 for문 시간초과
		System.out.println(Arrays.toString(result));
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
		// stack 정답
		System.out.println(Arrays.toString(answer));
	}

}
