package programmers;

import java.util.Arrays;

public class PRO_1_Corona {
	public static void main(String[] args) {
		// X 파티션 / P 사람 / O 빈 자리
		String[][] place = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
							{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
							{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		int[] answer = new int[place.length];
		for(int i = 0;i<place.length;i++) {
			for(int j = 0;j<place[0].length;j++) {
				String str = place[i][j];
				for(int k = 1;k<str.length();k++) {
					if(str.charAt(k-1)=='P' && str.charAt(k)=='P') {
						answer[i] = 0;
						break;
					}else {
						answer[i] = 1;
					}
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	}

}
