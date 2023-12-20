package programmers.PRO2;

public class PRO2_250136 {
	static boolean[][] check;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	static int rowLen, colLen, num;
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{0, 0, 0, 1, 1, 1, 0, 0},{0, 0, 0, 0, 1, 1, 0, 0},{1, 1, 0, 0, 0, 1, 1, 0},
			{1, 1, 1, 0, 0, 0, 0, 0},{1, 1, 1, 0, 0, 0, 1, 1}}));
		System.out.println(solution(new int[][] {{1,0,1,0,1,1},{1,0,1,0,0,0},{1,0,1,0,0,1},{1,0,0,1,0,0},{1,0,0,1,0,1},{1,0,0,0,0,0},{1,1,1,1,1,1}}));
	}
	 public static int solution(int[][] land) {
        int answer = 0;
        rowLen = land.length;
        colLen = land[0].length;
        check = new boolean[rowLen][colLen];
        for(int i = 0;i<colLen;i++) {
        	num = 0;
        	for(int j = 0;j<rowLen;j++) {
        		System.out.print(land[j][i]+" ");
        		if(!check[i][j] && land[j][i]==1) {
        			num = 0;
        			dfs(j,i,land);
        		}
        	}
        	System.out.println("num : "+num);
        }
        System.out.println(rowLen+" "+colLen);
        return answer;
    }
	 public static void dfs(int x, int y, int[][] land) {
		 check[x][y] = true;
		 for(int i = 0;i<4;i++) {
			 int nx = x+dx[i];
			 int ny = y+dy[i];
			 if(cheking(nx, ny)) {
				 if(!check[ny][nx] && land[ny][nx]==1) {
					 check[ny][nx] = true;
					 num++;
					 dfs(ny,nx,land);
					 check[ny][nx] = false;
				 }
			 }
		 }
	 }
	 public static boolean cheking(int x, int y) {
		 return x < colLen && x >= 0 && y < rowLen && y >= 0;
	 }
}
