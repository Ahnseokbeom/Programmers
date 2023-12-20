package programmers.PRO1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PRO1_68644 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(new int[] {2,1,3,4,1})));
		System.out.println(Arrays.toString(solution(new int[] {5,0,2,7})));
	}
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                int sum = numbers[i]+numbers[j];
                if(!arr.contains(sum)){
                    arr.add(sum);
                }
            }
        }
        Collections.sort(arr);
        answer = new int[arr.size()];
        for(int k = 0;k<arr.size();k++){
            answer[k] = arr.get(k);
        }
        return answer;
    }
}
