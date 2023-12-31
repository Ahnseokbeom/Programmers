package programmers.PRO2;

import java.util.Arrays;
import java.util.HashSet;

public class PRO2_131701 {
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {7,9,1,1,4}));
	}
	public static int solution(int[] elements) {
		int[] arr = new int[elements.length*2];
		for(int i = 0;i<elements.length;i++) {
			arr[i] = arr[i+elements.length] = elements[i];
		}
		HashSet<Integer> set = new HashSet<>();

		for(int i = 1;i<=elements.length;i++) {
			for(int j = 0;j<elements.length;j++) {
				set.add(Arrays.stream(arr,j,j+i).sum());
			}
		}
		return set.size();
	}
}
