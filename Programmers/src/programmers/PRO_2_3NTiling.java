package programmers;

public class PRO_2_3NTiling {
	static long[] dp;
	static int mod = 1000000007;
	public static void main(String[] args) {
		System.out.println(solution(6));
	}
	public static int solution(int n) {
		dp = new long[5001];
		long answer = 0;
		dp[0] = 0;
		dp[2] = 3;
		for(int i = 4;i<=n;i+=2) {
			dp[i] = (3*dp[i-2]+2*(answer+1))%mod;
			answer = (answer + dp[i-2])%mod;
		}
		return (int)dp[n]%mod;
	}
}
