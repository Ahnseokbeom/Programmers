package programmers.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PRO_181927 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
	}
	public static String solution(int[] numLog) {
        return IntStream.range(1, numLog.length)
                .mapToObj(i -> {
                    int diff = numLog[i] - numLog[i - 1];
                    switch (diff) {
                        case 1:
                            return "w";
                        case -1:
                            return "s";
                        case 10:
                            return "d";
                        case -10:
                            return "a";
                        default:
                            return "";
                    }
                })
                .collect(Collectors.joining());
    }
}
