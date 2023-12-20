package programmers.PRO2;

import java.util.LinkedList;
import java.util.Queue;

public class PRO2_게임맵최단거리  {
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,1,-1};
	static int check[][];
	static int count;
	static int answer = 0;
	public static void main(String[] args) {
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		check = new int[maps.length][maps[0].length];
		check[0][0] = 1;
		dfs(maps);
		answer = check[maps.length-1][maps[0].length-1];
		System.out.println(answer==0?-1:answer);

		int[][] maps2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		check = new int[maps2.length][maps2[0].length];
		check[0][0] = 1;
		dfs(maps2);
		answer = 0;
		answer = check[maps2.length-1][maps2[0].length-1];
		System.out.println(answer==0?-1:answer);
	}
	public static void dfs(int[][] maps) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0,0});

		while(!q.isEmpty()) {
			int[] remove = q.remove();
			int rx = remove[0];
			int ry = remove[1];
			for(int i = 0;i<4;i++) {
				int nx = rx+dx[i];
				int ny = ry+dy[i];
				if(nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length) {
					if(check[nx][ny]==0 && maps[nx][ny]==1) {
						check[nx][ny] = check[rx][ry]+1;
						q.add(new int[] {nx,ny});
					}
				}
			}
		}
	}
}

