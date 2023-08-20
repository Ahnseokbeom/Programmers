package programmers;

import java.util.Arrays;
import java.util.Stack;

public class PRO_2_BehindBigNumberFind {
	public static void main(String[] args) {
		int[] numbers1 = {2,3,3,5};
		System.out.println(Arrays.toString(solution(numbers1)));

		int[] numbers2 = {9,1,5,3,6,2};
		System.out.println(Arrays.toString(solution(numbers2)));
	}
	public static int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		Stack<Integer> stack = new Stack<>();
		for(int i = numbers.length-1;i>=0;i--) {
			while(!stack.isEmpty()) {
				if(stack.peek() > numbers[i]) {
					answer[i] = stack.peek();
					break;
				}else stack.pop();
			}
			if(stack.isEmpty()) answer[i] = -1;
			stack.push(numbers[i]);
		}
		return answer;

	}

}
