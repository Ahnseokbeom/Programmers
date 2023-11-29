package programmers.stream;

import java.util.Arrays;

public class PRO_n보다커질때까지더하기 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {34, 5, 71, 29, 100, 34}, 123));
		System.out.println(solution(new int[] {58, 44, 27, 10, 100}, 139));
	}
	public static int solution(int[] numbers, int n) {
        int[] sum = {0};
        return Arrays.stream(numbers)
                .filter(number -> {
                    if (sum[0] <= n) {
                        sum[0] += number;
                        return true;
                    } else {
                        return false;
                    }
                }).sum();
    }
}
