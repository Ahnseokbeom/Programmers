package programmers.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PRO_배열에서문자열대소문자변환하기 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[]{"AAA","BBB","CCC","DDD"})));
		System.out.println(Arrays.toString(solution(new String[] {"aBc","AbC"})));
	}
	public static String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }
}
