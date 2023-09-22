package programmer.PRO3;

public class PRO_3_SchoolRoad {
	public static int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int mod = 1000000007;
        int[][] dp = new int[n+1][m+1];
        for(int i = 0;i<puddles.length;i++) {
        	dp[puddles[i][1]][puddles[i][0]] = -1;
        }
        dp[1][1] = 1;
        for(int i = 1;i<=n;i++) {
        	for(int j = 1;j<=m;j++) {
        		if(dp[i][j]==-1) continue;
        		if(dp[i-1][j] > 0) dp[i][j] +=dp[i-1][j]%mod;
        		if(dp[i][j-1] > 0) dp[i][j] +=dp[i][j-1]%mod;
        	}
        }
        answer = dp[n][m]%mod;
        return answer;
    }
	public static void main(String[] args) {
		int m = 4;
		int n = 3;
		int[][] puddles = {{2,2}};
		System.out.println(solution(m,n,puddles));

	}
}
