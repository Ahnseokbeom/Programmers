package programmers.PRO2;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO2_기능개발 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(new int[] {93,30,55}, new int[] {1,30,5})));
		System.out.println(Arrays.toString(solution(new int[] {95,90,99,99,80,99}, new int[] {1,1,1,1,1,1})));
	}
	public static int[] solution(int[] progresses, int[] speeds) {
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
        return answer;
    }
}
