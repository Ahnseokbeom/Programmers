package programmers;

public class PRO_1_SquareRoot {
	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        double d = Math.sqrt(n)+1;
	        if(d-(int)d==0){
	            answer = (long)Math.pow((long)d,2);
	        }else{
	            answer = -1;
	        }
	        return answer;
	    }
	}
}
