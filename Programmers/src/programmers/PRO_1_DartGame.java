package programmers;

public class PRO_1_DartGame {
	class Solution {
	    public int solution(String dartResult) {
	        // 각 라운드에서 획득한 점수 (총 3개 라운드)
	        int[] round = new int[3];
	        char[] carr = dartResult.toCharArray();
	        // 인덱스 조정을 위해 -1부터 시작 매 반복마다 증가시켜야 하는데 첫 번째 반복에서는 0이 되도록
	        int idx = -1;
	        for (int i=0;i<carr.length;i++) {
	            // n번째 라운드에 쏜 점수가 0~9인 경우
	            if (carr[i] >= '0' && carr[i] <= '9') {
	                idx++; // 이전 라운드에서 현재 라운드로 증가된 것 (-1 -> 0)
	                // 점수 추가
	                round[idx] += Integer.parseInt(String.valueOf(carr[i]));
	                // n번째 라운드에 쏜 점수가 10점인 경우
	                if (i+1!=carr.length-1 && carr[i+1] == '0'&& carr[i] == '1') {
	                    round[idx] -= Integer.parseInt(String.valueOf(carr[i]));
	                    round[idx] = 10;
	                    i++;
	                }
	            } else if (carr[i] == 'D') { // 보너스 Double
	                round[idx] *= round[idx]; // 제곱
	            } else if(carr[i] == 'T') { // 보너스 Triple
	                round[idx] *= round[idx] * round[idx]; // 세제곱
	            } else if (carr[i] == '*') { // 이전 라운드와 현재 라운드에 *2
	                if (idx > 0) round[idx-1] *=2;
	                round[idx] *= 2;
	            } else if (carr[i] == '#') { // 현재 라운드에 * -1
	                round[idx] *= -1;
	            }
	        }
	        return round[0] + round[1] + round[2];
	    }
	}


}
