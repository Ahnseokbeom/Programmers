package programmers;

import java.util.Arrays;

public class PRO_1_DesktopCleanup {
	public static void main(String[] args) {
	    String[] t1 = {".#...", "..#..", "...#."};
	    String[] t2 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
	    String[] t3 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
	    String[] t4 = {"..","#."};
		System.out.println( Arrays.toString(solution(t1)));
		System.out.println( Arrays.toString(solution(t2)));
		System.out.println( Arrays.toString(solution(t3)));
		System.out.println( Arrays.toString(solution(t4)));
	}
	public static int[] solution(String[] wallpaper) {
		int minX = wallpaper[0].length();
		int maxX = 0;
		int minY = wallpaper.length;
		int maxY = 0;
		for(int i = 0;i<wallpaper.length;i++) {
			int first = wallpaper[i].indexOf("#");
			int last = wallpaper[i].lastIndexOf("#");
			if(first >= 0) {
				if(first < minX) minX = first;
				if(last > maxX) 	maxX = last;

				if(i < minY) minY = i;
				if(i > maxY) maxY = i;
			}
		}
		maxX++;
		maxY++;
		int[] answer = {minY,minX,maxY,maxX};
		return answer;
	}

}
