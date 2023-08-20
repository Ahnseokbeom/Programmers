package programmers;

public class PRO_1_Measure {

	class Solution {
	    public int solution(int left, int right) {
	    	 int answer = 0;
	    	 int minus = right-left;
	    	 int min = left;

	    	 for(int i = 0;i<=minus;i++) {
	    		 int count = 0;
	    		 left = min + i;
	    		 for(int j = 1;j<left;j++) {
	    			 if(left%j==0) {
	    				 count++;
	    			 }
	    		 }
	    		 if(count%2==0) {
	    			 answer += left;
	    		 }else answer += left*-1;
	    	 }
	    	 answer = -answer;
	        return answer;
	    }
	}

}
