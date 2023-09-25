package programmers.PRO2;

public class PRO2_땅따먹기 {
	public static void main(String[] args) {
		
		System.out.println(solution(new int[][] {{1,2,3,5},{5,6,7,8},{4,3,2,1}}));
	}
	public static int solution(int[][] land) {
        int answer = 0;
		for(int i = 1;i<land.length;i++) {
			land[i][0]+=MaxNum(land[i-1][1],land[i-1][2],land[i-1][3]);
			land[i][1]+=MaxNum(land[i-1][0],land[i-1][2],land[i-1][3]);
			land[i][2]+=MaxNum(land[i-1][0],land[i-1][1],land[i-1][3]);
			land[i][3]+=MaxNum(land[i-1][0],land[i-1][1],land[i-1][2]);
		}
		for(int count : land[land.length-1]) {
			answer = Math.max(answer, count);
		}
        return answer;
	}
	static public int MaxNum(int a, int b,int c) {
	int max = 0;
	max = Math.max(Math.max(a, b), c);
	return max;
	}
}
