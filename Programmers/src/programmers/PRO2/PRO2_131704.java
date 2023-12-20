package programmers.PRO2;

import java.util.Stack;

public class PRO2_131704 {
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {4,3,1,2,5}));
		System.out.println(solution(new int[] {5,4,3,2,1}));
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
