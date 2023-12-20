package programmers.stream;

import java.util.Arrays;

public class PRO_181882 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 100, 99, 98})));
	}
	 public static int[] solution(int[] arr) {
        return Arrays.stream(arr)
        		.map(i -> (i%2==0 && i >= 50)?i/2:(i%2!=0 && i < 50)?i*2:i)
        		.toArray();
    }
}
