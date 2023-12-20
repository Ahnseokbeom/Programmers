package programmers.PRO1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PRO1_12910 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(new int[] {5,9,7,10}, 5)));
		System.out.println(Arrays.toString(solution(new int[] {2,36,1,3}, 1)));
		System.out.println(Arrays.toString(solution(new int[] {3,2,6}, 10)));
	}
    public static int[] solution(int[] arr, int divisor) {
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
