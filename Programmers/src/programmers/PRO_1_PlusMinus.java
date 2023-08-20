package programmers;

public class PRO_1_PlusMinus {
	class Solution {
	    public int solution(int[] absolutes, boolean[] signs) {
	    	int sum = 0;
	    	for(int i = 0;i<absolutes.length;i++) {
	    		if(signs[i]==true) {
	    			sum+=absolutes[i]*1;
	    		}else {
	    			sum+=absolutes[i]*-1;
	    		}
	    	}
	        int answer = sum;
	        return answer;
	    }
	}
}
