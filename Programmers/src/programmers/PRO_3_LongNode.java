package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PRO_3_LongNode {
	public static void main(String[] args) {
		System.out.println(solution(6, new int[][] {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}}));
	}
	public static int solution(int n, int[][] edge) {
        int answer = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] distance = new int[n + 1];

        for (int i = 0; i < n + 1; i++)
            graph.add(new ArrayList<>());
        for (int i = 0; i < edge.length; i++) {
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }
        boolean[] visited = new boolean[n + 1];
        visited[1] = true;
        Queue<Integer> bfs = new LinkedList<>();
        bfs.add(1);
        while (bfs.size() != 0) { // 2~n까지 도착하는 경로 구하기
            int nowNode = bfs.poll();
            ArrayList<Integer> node = graph.get(nowNode);
            for(int i = 0; i < node.size(); i++) {
                if (visited[node.get(i)] == false) {
                    bfs.add(node.get(i));
                    visited[node.get(i)] = true;
                    distance[node.get(i)] = distance[nowNode] + 1;
                }
            }
        }
        Arrays.sort(distance);
        int max = distance[distance.length-1];
        for(int i = distance.length-1; distance[i] == max; i--)
            answer++;
        return answer;
    }
}
