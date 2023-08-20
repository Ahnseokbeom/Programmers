package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class PRO_3_PerformanceAppraisal {
	public static void main(String[] args) {
		int[][] scores = {{2,2},{1,4},{3,2},{3,2},{2,1}};
		System.out.println(solution(scores));
	}
	public static int solution(int[][] scores) {
		int answer = 1;
        int[] person = scores[0];
        Arrays.sort(scores, new Comparator<int[]>(){
           @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] < o2[0])
                    return 1;
                else if(o1[0] == o2[0]) {
                    if(o1[1] > o2[1])
                        return 1;
                    else
                        return -1;
                }
                else return -1;
            }
        });
        int myPoint = person[0] + person[1];
        int peer = 0;
        for(int[] score : scores) {
            if(score[1] < peer) {
                if(person[0] == score[0] && person[1] == score[1])
                    return -1;
            }
            else {
                peer = Math.max(score[1], peer);
                if(myPoint < score[0] + score[1])
                    answer++;
            }
        }
        return answer;
    }
}
