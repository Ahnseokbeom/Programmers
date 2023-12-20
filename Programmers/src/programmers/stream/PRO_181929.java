package programmers.stream;

import java.util.Arrays;

public class PRO_181929 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3, 4, 5, 2, 1}));
		System.out.println(solution(new int[] {5,7,8,3}));
	}
	public static int solution(int[] num_list) {
        int sum = (int)Math.pow(Arrays.stream(num_list).sum(),2);
        int mul = Arrays.stream(num_list).reduce(1, (a,b) -> a*b);
        return sum > mul?1:0;
    }
}
