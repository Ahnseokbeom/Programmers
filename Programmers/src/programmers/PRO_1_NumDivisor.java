package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class PRO_1_NumDivisor {
	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	    	ArrayList<Integer> array = new ArrayList<>();
	    	for(int i = 0;i<arr.length;i++) {
	    		if(arr[i]%divisor==0) {
	    			array.add(arr[i]);
	    		}
	    	}
	    	int[] answer = new int[array.size()];
	    	if(array.isEmpty()) {
	    		array.add(-1);
	    		answer = new int[array.size()];
	    		answer[0] = array.get(0);
	    	}else {
	    		Collections.sort(array);
		        for(int i = 0;i<array.size();i++) {
		        	answer[i] = array.get(i);
		        }
	    	}

	        return answer;
	    }
	}
}
