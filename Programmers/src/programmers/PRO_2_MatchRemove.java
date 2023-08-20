package programmers;

import java.util.Stack;

public class PRO_2_MatchRemove {
	class Solution
	{
	    public int solution(String s)
	    {
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

}
