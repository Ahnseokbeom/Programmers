package programmers.stream;

import java.util.stream.IntStream;

public class PRO_문자열겹쳐쓰기 {
	public static void main(String[] args) {
      System.out.println(solution("He11oWor1d", "lloWorl", 2));
      System.out.println(solution("Program29b8UYP", "merS123", 7));
	}
	 public static String solution(String myString, String overwriteString, int s) {
	        int endIndex = s + overwriteString.length();
	        return IntStream.range(0, myString.length())
	                .mapToObj(i -> (i >= s && i < endIndex) ? overwriteString.charAt(i - s) : myString.charAt(i))
	                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
	                .toString();
    }
}
