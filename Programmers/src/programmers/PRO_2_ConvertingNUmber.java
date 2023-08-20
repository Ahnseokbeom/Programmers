package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class PRO_2_ConvertingNUmber {
	public static void main(String[] args) {
		int x1 = 10;
		int y1 = 40;
		int n1 = 5;
		System.out.println(solution(x1, y1, n1));

		int x2 = 10;
		int y2 = 40;
		int n2 = 30;
		System.out.println(solution(x2, y2, n2));

		int x3 = 2;
		int y3 = 5;
		int n3 = 4;
		System.out.println(solution(x3, y3, n3));
	}
	public static int solution(int x, int y, int n) {
        int answer = 0;
        if(x==y) return 0;
        int[] arr = new int[10000001];
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        while(!q.isEmpty()) {
        	int num = q.poll();
        	int[] temp = new int[3];
        	temp[0] = num+n;
        	temp[1] = num*2;
        	temp[2] = num*3;

        	for(int i=0; i<3; i++){
                int next = temp[i];
                if(next>y){
                    continue;
                }
                if(arr[next] == 0 || arr[next] > arr[num]+1){
                    arr[next] = arr[num]+1;
                    q.add(next);
                }
            }

        }
        answer = arr[y] != 0 ? arr[y] : -1;
        return answer;
    }

}
