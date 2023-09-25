package programmers.PRO2;

public class PRO2_하노이의탑 {
	static int index = 0;
    public static int[][] solution(int n) {
        int[][] answer = new int[(int)Math.pow(2, n) - 1][2];
	    hanoi(n,1, 3, 2, answer);
        return answer;
    }
    public static void hanoi(int n, int start, int dest, int waypoint, int[][] answer){
	if(n == 1)
		answer[index++] = new int[] {start, dest};
	else{
		hanoi(n-1, start, waypoint, dest, answer);
		answer[index++] = new int[] {start, dest};
		hanoi(n-1, waypoint, dest, start, answer);
	    }
    }
}
