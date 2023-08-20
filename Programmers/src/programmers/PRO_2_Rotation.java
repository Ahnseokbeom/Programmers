package programmers;

import java.util.Stack;

public class PRO_2_Rotation {
	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        String str = s;
	        for(int i = 0; i < s.length(); i++){
	            if(result(str)) answer++;
	            str = str.substring(1, s.length()) + str.charAt(0);
	        }

	        return answer;
	    }

	    boolean result(String s){
	        Stack<Character> stack = new Stack<>();
	        for(int i = 0; i < s.length(); i++){
	            try{
	                switch(s.charAt(i)){
	                    case '[':
	                        stack.add('[');
	                        break;
	                    case ']':
	                        if(stack.peek() != '[') return false;
	                        stack.pop();
	                        break;
	                    case '{':
	                        stack.add('{');
	                        break;
	                    case '}':
	                        if(stack.peek() != '{') return false;
	                        stack.pop();
	                        break;
	                    case '(':
	                        stack.add('(');
	                        break;
	                    case ')':
	                        if(stack.peek() != '(') return false;
	                        stack.pop();
	                        break;
	                }
	            } catch(Exception e){
	                return false;
	            }
	        }
	        return stack.isEmpty() ? true : false;
	    }
	}
}
