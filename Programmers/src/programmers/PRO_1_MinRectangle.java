package programmers;

import java.util.Arrays;

public class PRO_1_MinRectangle {
	public static void main(String[] args) {
//		int[][] num = {{10,7},{12,3},{8,15},{14,7},{5,15}};
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
		int[] a = {1,2,3};
		int lmax = Integer.MIN_VALUE;
		int rmax = Integer.MIN_VALUE;
        int[] n = new int[sizes.length];
		for(int i = 0;i<sizes.length;i++) {
			if(sizes[i][0]>lmax) lmax = sizes[i][0];
			if(sizes[i][1]>rmax) rmax = sizes[i][1];
            if(sizes[i][0]>sizes[i][1]) n[i] = 0;
			if(sizes[i][0]<sizes[i][1]) n[i] = 1;
		}
		System.out.println(Arrays.toString(n));
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
                System.out.println("rmax : "+ rmax);
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
                System.out.println("lmax : "+ lmax);
            }
        }
        System.out.println(lmax+" "+rmax);
        System.out.println(rmax*lmax);
	}

}
