package programmers.PRO2;

import java.util.Arrays;

public class PRO2_카카오프렌즈컬러링북 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(6, 4, new int[][] {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}})));
	}
    public static int[] solution(int m, int n, int[][] picture) {
    	// 영역
        int numberOfArea = 0;
        // 최대 갯수
        int maxSizeOfOneArea = 0;
        boolean[][] check = new boolean[m][n];
        int[] answer = new int[2];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(!check[i][j] && picture[i][j] != 0){
                    int count = dfs(i,j,picture,check);
                    if(maxSizeOfOneArea < count){
                        maxSizeOfOneArea = count;
                    }
                    numberOfArea++;
                }
            }
        }
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
	static int dfs(int x, int y, int[][] picture, boolean[][] check) {
		check[x][y] = true;
		int count = 1;
		int[] dx = {1,-1,0,0};
		int[] dy = {0,0,1,-1};
		for(int z = 0; z<4;z++) {
			int cX = x+dx[z];
			int cY = y+dy[z];
			if(cX >= 0 && cX < picture.length && cY >= 0 && cY < picture[0].length) {
				if(check[cX][cY]) continue;
				if(picture[cX][cY] == picture[x][y]) {
					count+= dfs(cX,cY,picture,check);
				}
			}
		}
		return count;
	}
}

