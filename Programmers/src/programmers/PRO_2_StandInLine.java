package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO_2_StandInLine {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3,5)));
	}
	public static int[] solution(int n, long k) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[n];
        int num = 1;
        for(int i = 1;  i <= n; i++) {
            num *= i;
            list.add(i);
        }
        k--;
        int idx = 0;
        while(n>0) {
    		num /= n;
            answer[idx++] = list.get((int) (k/num));
            list.remove((int)k/num);
            k %= num;
            n--;
        }
        return answer;
    }
}
