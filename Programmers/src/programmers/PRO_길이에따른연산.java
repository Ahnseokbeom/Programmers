package programmers;

import java.util.Arrays;

public class PRO_길이에따른연산 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
		System.out.println(solution(new int[] {2,3,4,5}));
	}
	public static int solution(int[] num_list) {
		return num_list.length>10?Arrays.stream(num_list).sum():Arrays.stream(num_list).reduce(1, (a,b)->a*b);
	}
}
