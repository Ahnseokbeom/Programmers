package programmers.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PRO_qrCode {
	public static void main(String[] args) {
		System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
		System.out.println(solution(1, 0, "programmers"));
	}
	 public static String solution(int q, int r, String code) {
        return IntStream.range(0, code.length())
                .filter(i -> i % q == r)
                .mapToObj(code::charAt)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
