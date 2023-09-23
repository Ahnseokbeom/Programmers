package programmers.PRO1;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO1_같은숫자는싫어 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1,1,3,3,0,1,1})));
		System.out.println(Arrays.toString(solution(new int[] {4,4,4,3,3})));
	}
	public static int[] solution(int []arr) {
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
