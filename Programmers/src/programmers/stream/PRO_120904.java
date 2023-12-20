package programmers.stream;

import java.util.stream.IntStream;

public class PRO_120904 {
	public static void main(String[] args) {
		System.out.println(solution(29183, 1));
		System.out.println(solution(232443, 4));
		System.out.println(solution(123456, 7));
	}
	public static int solution(int num, int k) {
        int answer = IntStream.range(0, String.valueOf(num).length())
                .filter(i -> String.valueOf(num).charAt(i) == String.valueOf(k).charAt(0))
                .findFirst()
                .orElse(-1);
        return answer==-1?answer:answer+1;
    }
}
