package programmers;

public class PRO_2_Carpet {
	class Solution {
	    public int[] solution(int brown, int yellow) {
	        int[] answer = new int[2];
	        int sum = brown+yellow;
	        for(int i = 3;i<sum;i++) {
				int j = sum/i;
				if(sum%i==0 && j>=3) {
					int col = Math.max(i, j);
					int low = Math.min(i, j);
					int center = (col-2) * (low-2);
					if(center==yellow) {
						answer[0] = col;
						answer[1] = low;
						return answer;
					}
				}
			}
	        return answer;
	    }
	}
}
