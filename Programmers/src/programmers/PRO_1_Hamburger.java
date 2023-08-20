package programmers;

import java.util.Stack;

public class PRO_1_Hamburger {
	public static void main(String[] args) {
		int[] ham1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		int[] ham2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
		System.out.println(solution(ham1));
		System.out.println(solution(ham2));
	}
	public static int solution(int[] ingredient) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i : ingredient) {
			stack.add(i);
			if(stack.size() >= 4) {
				if(stack.get(stack.size()-1)==1&&
				   stack.get(stack.size()-2)==3&&
				   stack.get(stack.size()-3)==2&&
				   stack.get(stack.size()-4)==1) {
					answer++;
					for(int j = 0;j<4;j++) stack.pop();
				}
			}
		}
		return answer;
	}

}
