package programmers.PRO4;

import java.util.Arrays;

public class PRO4_단어퍼즐 {
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"ba","na","n","a"}, "banana"));
		System.out.println(solution(new String[] {"app","ap","p","l","e","ple","pp"}, "apple"));
		System.out.println(solution(new String[] {"ba","an","nan","ban","n"}, "banana"));
	}
	 public static int solution(String[] strs, String t) {
        int size = t.length();
        int[] dp = new int[size + 1];
        Arrays.fill(dp, size + 1);

        dp[0] = 0;

        for (int i = 1; i <= size; i++) {
            for (String str : strs) {
                if (i >= str.length() && t.substring(i - str.length(), i).equals(str)) {
                    dp[i] = Math.min(dp[i], dp[i - str.length()] + 1);
                }
            }
        }

        return dp[size] <= size ? dp[size] : -1;
    }
}
