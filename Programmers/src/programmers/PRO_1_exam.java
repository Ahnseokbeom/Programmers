package programmers;

import java.util.ArrayList;

//1번 수포자 - 12345 / 12345 / 12345
//2번 수포자 - 2 1 2 3 2 4 2 5 / 2 1 2 3 2 4 2 5
//3번 수포자 - 3 3 1 1 2 2 4 4 5 5  / 3 3 1 1 2 2 4 4 5 5
public class PRO_1_exam {
	class Solution {
	    public int[] solution(int[] answers) {
	        int[] answer = {};
	        int[] p1 = {1,2,3,4,5}; //이만큼씩 반복
	        int[] p2 = {2,1,2,3,2,4,2,5};
	        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
	        int re1=0, re2 =0, re3 =0;

	        for(int i =0; i<answers.length; i++){//5,8,10으로 나눈 이유는 저만큼 반복하기 위함
	            if(p1[i%5] == answers[i]) re1++; // answer의 i인덱스와 수포자들의 i인덱스 비교
	            if(p2[i%8] == answers[i]) re2++;
	            if(p3[i%10] == answers[i]) re3++;
	        }
	        int max = Math.max(Math.max(re1, re2),re3); // 최고값 구하기
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        if(max==re1) arr.add(1); //max값이랑 같으면 넣는다.
	        if(max==re2) arr.add(2);
	        if(max==re3) arr.add(3);

	        answer = new int[arr.size()]; // answer를 다시 초기화 해준다.

	        for(int i =0; i<answer.length; i++) { // 답의 i 인덱스의 arr의 i 인덱스 대입
	        	answer[i] = arr.get(i);
	        }

	        return answer;
	    }
	}
}
