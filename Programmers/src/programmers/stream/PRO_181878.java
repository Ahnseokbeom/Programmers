package programmers.stream;

public class PRO_181878 {
	public static void main(String[] args) {
		System.out.println(solution("AbCdEfG", "aBc"));
		System.out.println(solution("aaAA", "aaaaa"));
	}
	public static int solution(String myString, String pat) {
		return myString.toLowerCase().contains(pat.toLowerCase())?1:0;
	}
}
