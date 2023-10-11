package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PRO_정수찾기 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4,5}, 3));
		System.out.println(solution(new int[] {15, 98, 23, 2, 15}, 20));
	}
	public static int solution(int[] num_list, int n) {
		List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
		return list.contains(n)?1:0;
	}
}
