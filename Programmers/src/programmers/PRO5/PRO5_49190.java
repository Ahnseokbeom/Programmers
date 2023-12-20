package programmers.PRO5;

import java.util.HashSet;

public class PRO5_49190 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0}));
	}
	public static int solution(int[] arrows) {
        int[][] dirs = {{0, 1}, {1, 1}, {1, 0}, {1, -1},{0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};
        HashSet<String> visited = new HashSet<>();
        HashSet<String> edge = new HashSet<>();
        int x = 0;
        int y = 0;
        int result = 0;
        visited.add(x + "," + y);

        for (int arrow : arrows) {
            for (int i = 0; i < 2; i++) {
                int newX = x + dirs[arrow][0];
                int newY = y + dirs[arrow][1];
                String edge1 = x + "," + y + "->" + newX + "," + newY;
                String edge2 = newX + "," + newY + "->" + x + "," + y;
                if (visited.contains(newX + "," + newY) && !edge.contains(edge1) && !edge.contains(edge2)) result++;
                visited.add(newX + "," + newY);
                edge.add(edge1);
                edge.add(edge2);
                x = newX;
                y = newY;
            }
        }
        return result;
    }
}
