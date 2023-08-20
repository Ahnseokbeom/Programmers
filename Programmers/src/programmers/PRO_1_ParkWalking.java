package programmers;

import java.util.Arrays;

public class PRO_1_ParkWalking {
	public static void main(String[] args) {
		String[] p1 = {"SOO","OOO","OOO"};
		String[] r1 = {"E 2","S 2","W 1"};
		System.out.println(Arrays.toString(solution(p1, r1)));

		String[] p2 = {"SOO","OXX","OOO"};
		String[] r2 = {"E 2","S 2","W 1"};
		System.out.println(Arrays.toString(solution(p2, r2)));

		String[] p3 = {"OSO","OOO","OXO","OOO"};
		String[] r3 = {"E 2","S 3","W 1"};
		System.out.println(Arrays.toString(solution(p3, r3)));

	}
	public static int[] solution(String[] park, String[] routes) {
        char[][] arr = new char[park.length][park[0].length()];
        int x = 0;
        int y = 0;
        for(int i = 0;i<park.length;i++) {
        	arr[i] = park[i].toCharArray();
        	if(park[i].contains("S")) {
        		y = i;
        		x = park[i].indexOf("S");
        	}
        }
        for(String s : routes){
            String check = s.split(" ")[0];
            int len = Integer.parseInt(s.split(" ")[1]);

            int nx = x;
            int ny = y;

            for(int i = 0; i < len; i++){
                if(check.equals("E")){
                    nx++;
                }
                if(check.equals("W")){
                    nx--;
                }
                if(check.equals("S")){
                    ny++;
                }
                if(check.equals("N")){
                    ny--;
                }
                if(nx >=0 && ny >=0 && ny < arr.length && nx < arr[0].length){
                    if(arr[ny][nx] == 'X'){
                        break;
                    }
                    if(i == len-1){
                        x = nx;
                        y = ny;
                    }
                }
            }
        }
        int[] answer = {y,x};
        return answer;
    }

}
