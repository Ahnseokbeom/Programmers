package programmers.PRO1;

import java.util.ArrayList;

public class PRO1_크레인인형뽑기게임 {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(solution(board, moves));
	}
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		for(int i = 0;i<moves.length;i++) {
			for(int j = 0;j<board.length;j++) {
				int num = board[j][moves[i]-1];
				if(num > 0) {
					if(arr.get(arr.size()-1)==num) {
						arr.remove(arr.size()-1);
						answer+=2;
					}else {
						arr.add(num);
					}
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
        return answer;
    }
}
