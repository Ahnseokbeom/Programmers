package programmers.PRO3;

public class PRO3_49191 {
	public static void main(String[] args) {
		System.out.println(solution(5, new int[][]{{4,3},{4,2},{3,2},{1,2},{2,5}}));
	}
	public static int solution(int n, int[][] results) {
        int answer = 0;
        boolean[][] check = new boolean[n][n];
        for(int i = 0;i<results.length;i++) {
        	check[results[i][0]-1][results[i][1]-1] = true;
        }
        for(int i = 0;i<n;i++) {
        	for(int j = 0;j<n;j++) {
        		for(int k = 0;k<n;k++) {
        			if(check[j][i]&&check[i][k]) check[j][k] = true;
        		}
        	}
        }
        for(int i = 0;i<n;i++) {
        	int res = 0;
        	for(int j = 0;j<n;j++) {
        		if(check[i][j] || check[j][i]) res++;
        	}
        	if(res==n-1) answer++;
        }
        return answer;
    }
}
