package programmers.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PRO_181941 {
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"a","b","c"}));
		System.out.println(solution(new String[] {"a","a","b","b","adwqd","dadqw"}));
	}
	public static String solution(String[] arr) {
		return Arrays.stream(arr).collect(Collectors.joining());
	}
}
