package programmers.stream;

import java.util.stream.IntStream;

public class PRO_홀수vs짝수 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {4, 2, 6, 1, 7, 6}));
		System.out.println(solution(new int[] {-1, 2, 5, 6, 3}));
	}
	public static int solution(int[] num_list) {
		int odd = IntStream.range(0, num_list.length).filter(idx -> idx%2!=0).map(idx -> num_list[idx]).sum();
		int even = IntStream.range(0, num_list.length).filter(idx -> idx%2==0).map(idx -> num_list[idx]).sum();
		return Math.max(odd, even);
	}
}
