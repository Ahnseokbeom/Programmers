package programmers.PRO2;

import java.util.LinkedList;
import java.util.Queue;

public class PRO2_12909 {
	public static void main(String[] args) {
		
		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
	}
	public static boolean solution(String s) {
        boolean answer = true;
        Queue<Character> q = new LinkedList<>();
		for(int i = 0;i<s.length();i++) {
			if(q.isEmpty() || s.charAt(i)=='(') {
				q.offer(s.charAt(i));
			}else if(!q.isEmpty() && s.charAt(i)==')') {
				q.remove();
			}else if(q.isEmpty() && s.charAt(i)==')') q.offer(s.charAt(i));
		}
		if(q.isEmpty()) answer = true;
		else answer = false;
        return answer;
    }
}
