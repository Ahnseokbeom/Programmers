package programmers.PRO2;

import java.util.Stack;

public class PRO2_76502 {
	public static void main(String[] args) {
		
		System.out.println(solution("[](){}"));
		System.out.println(solution("}]()[{"));
		System.out.println(solution("[)(]"));
		System.out.println(solution("}}}"));
	}
	public static int solution(String s) {
        int answer = 0;
        for(int i = 0;i<s.length();i++) {
			if(check(s)) answer++;
			s = s.substring(1,s.length())+s.charAt(0);
		}
        return answer;
    }
	static boolean check(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
           switch(c) {
           case '(': stack.add(c); break;
           case '{': stack.add(c); break;
           case '[': stack.add(c); break;
           case ')':
        	   if(stack.isEmpty() || stack.peek()!='(') return false;
        	   stack.pop();
        	   break;
           case '}' :
        	   if(stack.isEmpty() || stack.peek()!='{') return false;
        	   stack.pop();
        	   break;
           case ']' :
        	   if(stack.isEmpty() || stack.peek()!='[') return false;
        	   stack.pop();
        	   break;
           }
        }
        return stack.isEmpty() ? true : false;
    }

}

