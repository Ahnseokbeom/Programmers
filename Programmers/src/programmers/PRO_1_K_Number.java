package programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PRO_1_K_Number {
    public static int[] solution(int[] array, int[][] commands) {
    	ArrayList<Integer> list = new ArrayList<>();
    	int[] answer = new int[commands.length];
    	for(int i = 0;i<commands.length;i++) {
    		for(int j = (commands[i][0])-1;j<commands[i][1];j++) {
    			list.add(array[j]);
    		}
			Collections.sort(list);
			answer[i] = list.get((commands[i][2])-1);
			list = new ArrayList<>();
    	}
        return answer;
		}
    public static void main(String[] args) {
		int[] arr = {1,5,2,6,3,7,4};
		int[][] list = {{2,5,3},{4,4,1},{1,7,3}};
		System.out.println(Arrays.toString(solution(arr,list)));
	}
}

