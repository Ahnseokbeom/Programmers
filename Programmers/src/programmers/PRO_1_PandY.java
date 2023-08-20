package programmers;

public class PRO_1_PandY {
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        s = s.toLowerCase();
	        int p = s.length()-s.replace(String.valueOf("p"), "").length();
	        int y = s.length()-s.replaceAll(String.valueOf("y"), "").length();
	        if(p==y) {
	        	answer = true;
	        }else {
	        	answer = false;
	        }

	        return answer;
	    }
	}
}
