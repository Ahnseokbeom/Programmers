package programmers.stream;

import java.util.Arrays;

public class PRO_1로만들기 {
	static int count;
	public static void main(String[] args) {
		System.out.println(solution(new int[] {12, 4, 15, 1, 14}));
	}

	public static int solution(int[] num_list) {
        return Arrays.stream(num_list)
            .map(i -> counting(i))
            .sum();
    }
    public static int counting(int n){
        int count = 0;
       while (n != 1) {
            if (n % 2 == 0) {
                count++;
                n /= 2;
            } else {
                count++;
                n = (n - 1) / 2;
            }
        }
        return count;
    }
}
