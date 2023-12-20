package programmers.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PRO_181888 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {4, 2, 6, 1, 7, 6}, 2)));
		System.out.println(Arrays.toString(solution(new int[] {4, 2, 6, 1, 7, 6}, 4)));
	}
	public static int[] solution(int[] num_list, int n) {
		return IntStream.range(0, num_list.length)
                .filter(i -> i % n == 0)
                .map(i -> num_list[i])
                .toArray();
	}
}
