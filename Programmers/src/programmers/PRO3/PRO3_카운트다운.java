package programmers.PRO3;

import java.util.Arrays;

public class PRO3_카운트다운 {
	static int[][] dp;
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(21)));
		System.out.println(Arrays.toString(solution(58)));
		System.out.println(Arrays.toString(solution(100000)));
	}
    public static int[] solution(int target) {
        int[] answer = new int[2];
        dp = new int[target+1][2];
        for(int i=0; i<=target; i++){
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][1] = 0;
        }
        dp[0][0] = 0;
        counting(target);
        answer[0] = dp[target][0];
        answer[1] = dp[target][1];
        return answer;
    }
    public static void counting(int target) {
    	for(int i=1; i<=target; i++){
            for(int j=1; j<=20; j++){
                //불을 쏘는 경우
                if(i-50>=0){
                    if(dp[i][0] > dp[i-50][0]+1){
                        dp[i][0] = dp[i-50][0]+1;
                        dp[i][1] = dp[i-50][1]+1;
                    }
                    else if(dp[i][0] == dp[i-50][0]+1){
                        dp[i][1] = Math.max(dp[i][1], dp[i-50][1]+1);
                    }

                }

                //싱글을 쏘는 경우
                if(i-j>=0){
                    if(dp[i][0] > dp[i-j][0]+1){
                        dp[i][0] = dp[i-j][0]+1;
                        dp[i][1] = dp[i-j][1]+1;
                    }
                    else if(dp[i][0] == dp[i-j][0]+1){
                        dp[i][1] = Math.max(dp[i][1], dp[i-j][1]+1);
                    }
                }

                //더블을 쏘는 경우
                if(i-2*j>=0){
                    if(dp[i][0] > dp[i-2*j][0]+1){
                        dp[i][0] = dp[i-2*j][0]+1;
                        dp[i][1] = dp[i-2*j][1];
                    }

                }

                //트리플을 쏘는 경우
                if(i-3*j>=0){
                    if(dp[i][0] > dp[i-3*j][0]+1){
                        dp[i][0] = dp[i-3*j][0]+1;
                        dp[i][1] = dp[i-3*j][1];
                    }
                }
            }
        }
    }
}
