package programmers;

public class PRO_문자열곱하기 {
	public static void main(String[] args) {
		System.out.println(solution("string", 3));
		System.out.println(solution("love", 10));
	}
	public static String solution(String my_string, int k) {
		return my_string.repeat(k);
	}
}
