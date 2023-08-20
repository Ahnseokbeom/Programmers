package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO_2_FunctionDevelopment {
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1,30,5};
//		int[] progresses = {95, 90, 99, 99, 80, 99};
//		int[] speeds = {1, 1, 1, 1, 1, 1};
//		int[] progresses = {99,99,98,97};
//		int[] speeds = {1,1,2,1};
//		int[] progresses = {99, 99, 99, 90, 89, 90};
//		int[] speeds = {1,1,1,1,1,1};
		int[] list = new int[100];
		int count = 0;
		for(int i = 0;i<progresses.length;i++) {
			while(progresses[i]+(speeds[i]*count)<100){
				count++;
			}
			list[count]++;
		}
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0;i<list.length;i++) {
			if(list[i]!=0) arr.add(list[i]);
		}
		int[] answer = new int[arr.size()];
		for(int i = 0;i<arr.size();i++) {
			answer[i] = arr.get(i);
		}
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(answer));

	}

}
