package programmers.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PRO_문자열섞기 {
	public static void main(String[] args) {
        System.out.println(solution("aaaaa", "bbbbb"));
    }

    public static String solution(String str1, String str2) {
        return IntStream.range(0, str1.length())
                .mapToObj(i -> "" + str1.charAt(i) + str2.charAt(i))
                .collect(Collectors.joining());
    }
}
