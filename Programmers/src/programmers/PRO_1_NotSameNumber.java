package programmers;

import java.util.ArrayList;

public class PRO_1_NotSameNumber {
	public int[] solution(int []arr) {
    	ArrayList<Integer> array = new ArrayList<>();
    	for(int i = 0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                array.add(arr[i]);
            }
        }
        array.add(arr[arr.length-1]);
    	int[] answer = new int[array.size()];
        for(int i = 0;i<array.size();i++) {
        	answer[i] = array.get(i);
        }

        return answer;
    }

}
