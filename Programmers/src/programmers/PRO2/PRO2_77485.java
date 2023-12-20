package programmers.PRO2;

import java.util.Arrays;

public class PRO2_77485 {
	public static void main(String[] args) {
		int[][] q1 = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		System.out.println(Arrays.toString(solution(6, 6, q1)));
		
		int[][] q2 = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
		System.out.println(Arrays.toString(solution(3, 3, q2)));
		System.out.println(Arrays.toString(solution(100, 97, new int[][] {{1,1,100,97}})));
	}
	public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] arr = new int[rows+1][columns+1];
        int n = 1;
        for(int i = 1 ; i <= rows; i++) {
            for(int j = 1;  j <= columns; j++) {
                arr[i][j] = n++;
            }
        }

		for(int i = 0 ; i < queries.length; i++) {
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int x2 = queries[i][2];
            int y2 = queries[i][3];
            System.out.println(x1+" "+y1+" "+x2+" "+y2);
            
            int temp = arr[x1][y1];

            int min = temp;

            for(int j = x1; j < x2; j++) {
                arr[j][y1] = arr[j+1][y1];
                min = Math.min(min, arr[j][y1]);
            }

            for(int j = y1; j < y2; j++) {
                arr[x2][j] = arr[x2][j+1];
                min = Math.min(min, arr[x2][j]);
            }

            for(int j = x2; j > x1; j--) {
                arr[j][y2] = arr[j-1][y2];
                min = Math.min(min, arr[j][y2]);
            }


            for(int j = y2; j > y1; j--) {
                arr[x1][j] = arr[x1][j-1];
                min = Math.min(min, arr[x1][j]);
            }
            arr[x1][y1+1] = temp;

            answer[i] = min;
        }
        return answer;
    }
}

