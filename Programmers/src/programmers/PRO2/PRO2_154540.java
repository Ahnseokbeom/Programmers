package programmers.PRO2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PRO2_무인도여행 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] {"X591X","X1X5X","X231X", "1XXX1"})));
		System.out.println(Arrays.toString(solution(new String[] {"XXX","XXX","XXX"})));
	}
	static boolean[][] check;
	static char[][] arr;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {-1,1,0,0};
    static int num;
    public static int[] solution(String[] maps) {
        List<Integer> list = new ArrayList<>();
        arr = new char[maps.length][maps[0].length()];
        check = new boolean[maps.length][maps[0].length()];
        for(int i = 0;i<maps.length;i++) {
        	for(int j = 0;j<maps[i].length();j++) {
        		arr[i][j] = maps[i].charAt(j);
        	}
        }
        for(int i = 0;i<arr.length;i++){
        	for(int j = 0;j<arr[i].length;j++) {
        		if(!check[i][j] && arr[i][j]!='X') {
        			num = arr[i][j]-'0';
        			dfs(i,j,arr);
        			list.add(num);
        		}
        	}
        }
        if(list.size()==0) return new int[] {-1};
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i = 0;i<list.size();i++) answer[i] = list.get(i);
        return answer;
    }
    public static void dfs(int x, int y,char[][] arr) {
    	check[x][y] = true;
    	for(int i = 0;i<4;i++) {
    		int nx = x+dx[i];
    		int ny = y+dy[i];
    		if(nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length) {
    			if(!check[nx][ny] && arr[nx][ny]!='X') {
    				check[nx][ny] = true;
    				num+=arr[nx][ny]-'0';
    				dfs(nx,ny,arr);
    			}
    		}
    	}
    }
}
