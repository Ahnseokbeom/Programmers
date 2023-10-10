package programmers;

public class PRO_원하는문자열찾기 {
	public static void main(String[] args) {
		System.out.println(solution("AbCdEfG", "aBc"));
		System.out.println(solution("aaAA", "aaaaa"));
	}
	public static int solution(String myString, String pat) {
		return myString.toLowerCase().contains(pat.toLowerCase())?1:0;
	}
}
