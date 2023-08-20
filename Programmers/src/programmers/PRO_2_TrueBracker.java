package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class PRO_2_TrueBracker {
	public static void main(String[] args) {
		String s = "()()";
//		String s = "(())()";
//		String s = ")()(";
//		String s = "(()(";
		Queue<Character> q = new LinkedList<>();
		boolean answer = true;
		for(int i = 0;i<s.length();i++) {
			if(q.isEmpty() || s.charAt(i)=='(') {
				q.offer(s.charAt(i));
			}else if(!q.isEmpty() && s.charAt(i)==')') {
				q.remove();
			}else if(q.isEmpty() && s.charAt(i)==')') q.offer(s.charAt(i));
		}
		if(q.isEmpty()) answer = true;
		else answer = false;
		System.out.println(answer);
	}

}
