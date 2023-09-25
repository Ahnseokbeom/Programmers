package programmers.PRO2;

import java.util.Stack;

public class PRO2_짝지어제거하기 {
	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
		System.out.println(solution("cdcd"));
	}
    public static int solution(String s){
        int answer = -1;
        Stack<String> stack = new Stack<>();
		for(int i = 0;i<s.length();i++) {
			if(!stack.isEmpty() && stack.peek().equals(s.charAt(i)+""))
                stack.pop();
			else stack.push(s.charAt(i)+"");
		}
        answer = stack.isEmpty()?1:0;
        return answer;
    }
}
