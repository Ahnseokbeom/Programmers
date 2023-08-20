package programmers;

public class PRO_3_Network {
	public static void main(String[] args) {
		System.out.println(solution(3,new int[][] {{1,1,0},{1,1,0},{0,0,1}}));
		System.out.println(solution(3,new int[][] {{1,1,0},{1,1,1},{0,1,1}}));
	}
	public static int solution(int n, int[][] computers) {
		int answer = 0;
		boolean[] visit = new boolean[n];
		for(int i = 0;i<n;i++) {
			if(!visit[i]) {
				dfs(i,computers,visit);
				answer++;
			}
		}
		return answer;
	}
	private static void dfs(int i, int[][] computers,boolean[] visit) {
		visit[i] = true;
		for(int j = 0;j<computers.length;j++) {
			if(computers[i][j] == 1 && !visit[j]) {
				dfs(j,computers,visit);
			}
		}
	}

}
