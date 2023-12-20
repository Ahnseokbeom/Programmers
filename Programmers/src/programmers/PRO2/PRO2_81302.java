package programmers.PRO2;

import java.util.Arrays;

public class PRO2_81302 {
	public static void main(String[] args) {
		// X 파티션 / P 사람 / O 빈 자리
		String[][] place = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
							{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
							{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		System.out.println(Arrays.toString(solution(place)));
	}
	public static int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for(int i = 0;i<places.length;i++) {
			for(int j = 0;j<places[0].length;j++) {
				String str = places[i][j];
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
        return answer;
    }
}
