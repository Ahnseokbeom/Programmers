package programmers.PRO3;

public class PRO3_가장긴팰린드롬 {
	public static void main(String[] args) {
		System.out.println(solution("abcdcba"));
		System.out.println(solution("abacde"));
	}
	public static int solution(String s) {
        if (s == null || s.length() == 0) return 0;
        int maxLength = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = palindrome(s, i, i); // 홀수 길이의 팰린드롬
            int len2 = palindrome(s, i, i + 1); // 짝수 길이의 팰린드롬
            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return maxLength;
    }

    private static int palindrome(String s, int left, int right) {
        int L = left;
        int R = right;

        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }

        return R - L - 1;
    }
}
