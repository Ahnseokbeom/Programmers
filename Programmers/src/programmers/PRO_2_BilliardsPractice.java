package programmers;

import java.util.Arrays;

public class PRO_2_BilliardsPractice {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10, 10, 3, 7,new int[][] {{7,7},{2,7},{7,3}})));
	}
	public static int func(int x1, int y1, int x2, int y2) {
		return (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	public static int[] solution(int m, int n, int startX, int startY, int[][] balls) {
		int[] answer = new int[balls.length];
		for (int i = 0; i < balls.length; i++) {
			int targetX = balls[i][0];
			int targetY = balls[i][1];

			int curlen, len = Integer.MAX_VALUE;

			// 상
			if (!(startX == targetX && startY <= targetY)) {
				curlen = func(startX, startY, targetX, n + (n - targetY));
				len = curlen < len ? curlen : len;
			}
			// 하
			if (!(startX == targetX && startY >= targetY)) {
				curlen = func(startX, startY, targetX, targetY * (-1));
				len = curlen < len ? curlen : len;
			}

			// 좌
			if (!(startY == targetY && startX >= targetX)) {
				curlen = func(startX, startY, targetX * (-1), targetY);
				len = curlen < len ? curlen : len;
			}

			// 우
			if (!(startY == targetY && startX <= targetX)) {
				curlen = func(startX, startY, m + (m - targetX), targetY);
				len = curlen < len ? curlen : len;
			}

			answer[i] = len;
		}

		return answer;
	}
}
