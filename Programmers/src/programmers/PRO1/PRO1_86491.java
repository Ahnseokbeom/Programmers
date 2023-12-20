package programmers.PRO1;

import java.util.Arrays;

public class PRO1_86491 {
	public static void main(String[] args) {

		System.out.println(solution(new int[][] {{60,50},{30,70},{60,30},{80,40}}));
		System.out.println(solution(new int[][] {{10,7},{12,3},{8,15},{14,7},{5,15}}));
		System.out.println(solution(new int[][] {{14,4},{19,6},{6,16},{18,7},{7,11}}));
	}
	public static int solution(int[][] sizes) {
        int answer = 0;
        int lmax = Integer.MIN_VALUE;
		int rmax = Integer.MIN_VALUE;
        int[] n = new int[sizes.length];
		for(int i = 0;i<sizes.length;i++) {
			if(sizes[i][0]>lmax) lmax = sizes[i][0];
			if(sizes[i][1]>rmax) rmax = sizes[i][1];
            if(sizes[i][0]>sizes[i][1]) n[i] = 0;
			if(sizes[i][0]<sizes[i][1]) n[i] = 1;
		}
        if(lmax > rmax){
            rmax = Integer.MIN_VALUE;
            for(int i = 0;i<sizes.length;i++){
                if(lmax==sizes[i][0]){
                    if(rmax < sizes[i][1]) rmax = sizes[i][1]; continue;
                }
                if(n[i]==1){
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
                if(rmax < sizes[i][1]) rmax = sizes[i][1];
            }
        }else{
            lmax = Integer.MIN_VALUE;
            for(int i = 0;i<sizes.length;i++){
                if(rmax==sizes[i][1]){
                    if(lmax < sizes[i][0]) lmax = sizes[i][0]; continue;
                }
                if(n[i]==0){
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
                if(lmax < sizes[i][0]) lmax = sizes[i][0];
            }
        }
        return rmax*lmax;
    }
}
