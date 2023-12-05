package programmers.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PRO_가장큰수찾기 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1,8,3})));
		System.out.println(Arrays.toString(solution(new int[] {9,10,11,8})));
	}
	 public static int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[0] = IntStream.of(array)
        		.max().orElseThrow();
        answer[1] = IntStream.range(0, array.length)
        		.reduce((i,j) -> array[i] > array[j]?i:j)
        		.orElseThrow();
        return answer;
    }
}
