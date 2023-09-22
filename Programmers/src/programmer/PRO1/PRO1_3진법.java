package programmer.PRO1;

public class PRO1_3진법 {
	class Solution {
	    public int solution(int n) {
	        String answer = "";
	        while(n!=0){
	            answer+=n%3;
	            n/=3;
	        }
	        return Integer.parseInt(answer,3);
	    }
	}

}
