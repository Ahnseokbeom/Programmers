package programmers.PRO2;

public class PRO2_가장큰정사각형찾기 {
	static int[][] dp;
	public static void main(String[] args) {
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.out.println(solution(board));
	}
	public static int solution(int[][] board) {
		int answer = 0;
		dp = new int[board.length+1][board[0].length+1];
		for(int i = 1;i<=board.length;i++) {
			for(int j = 1;j<=board[0].length;j++) {
				if(board[i-1][j-1]!=0) {
					int min = Math.min(Math.min(dp[i][j-1], dp[i-1][j]),dp[i-1][j-1]);
					dp[i][j] = min+1;
					answer = Math.max(answer, min+1);
				}
			}
		}
		return answer*answer;
	}
}
