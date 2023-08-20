package programmers;

import java.util.Arrays;

public class PRO_2_TriangleSanil {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(4)));

		System.out.println(Arrays.toString(solution(5)));

		System.out.println(Arrays.toString(solution(6)));
	}
	public static int[] solution(int n) {
		int sum = (n*(n+1))/2;
        int[] answer = new int[sum];
        int[][] arr = new int[n][n];
        int num = 1;
        int x = -1,y = 0;
        for(int i = 0;i<n;i++) {
        	for(int j = i;j<n;j++) {
        		if(i%3==0) x++;
        		else if(i%3==1) y++;
        		else if(i%3==2) {
        			x--;
        			y--;
        		}
        		arr[x][y] = num++;
        	}
        }
        int idx = 0;
        for(int i = 0;i<n;i++) {
        	for(int j = 0;j<=i;j++) answer[idx++] = arr[i][j];
        }
        return answer;
    }
}
