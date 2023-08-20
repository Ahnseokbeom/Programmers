package programmers;

import java.util.Stack;

public class PRO_2_CourierBox {
	public static void main(String[] args) {
		int[] courier = {4,3,1,2,5};
		System.out.println(solution(courier));
		int[] order2 = {5,4,3,2,1};
		System.out.println(solution(order2));
	}
	public static int solution(int[] order) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		int courier = 1;
		int want = 0;
		while(true) {
			if(!stack.isEmpty() && order[want] == stack.peek()) {
				answer++;
				want++;
				stack.pop();
				continue;
			}
			if(courier > order.length) break;
			if(order[want] == courier) {
				answer++;
				want++;
				courier++;
				continue;
			}
			stack.push(courier);
			courier++;
		}
		return answer;
	}
}
