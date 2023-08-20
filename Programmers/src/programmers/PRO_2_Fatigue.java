package programmers;

public class PRO_2_Fatigue {
	 static int answer = 0;
		static boolean[] visit;
	    public int solution(int k, int[][] dungeons) {
	        visit = new boolean[dungeons.length];
			dfs(0,k,dungeons);
			return answer;
	    }
		static public void dfs(int d, int k, int[][] dungeons) {
			for(int i = 0;i<dungeons.length;i++) {
				if(!visit[i] && dungeons[i][0]<=k) {
					visit[i] = true;
					dfs(d+1,k-dungeons[i][1],dungeons);
					visit[i] = false;
				}
			}
			answer = Math.max(answer, d);
		}
}
