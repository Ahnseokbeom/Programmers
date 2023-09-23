package programmers.PRO1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PRO1_명예의전당1 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(3, new int[] {10, 100, 20, 150, 1, 100, 200})));
		System.out.println(Arrays.toString(solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
	}
	public static int[] solution(int k, int[] listore) {
        int[] answer = new int[listore.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<listore.length; i++) {
            if (i<k-1){
                list.add(listore[i]);
                list.sort(Collections.reverseOrder());
                answer[i]=list.get(list.size()-1);
            } else if (i>=k-1){
                list.add(listore[i]);
                list.sort(Collections.reverseOrder());
                answer[i]=list.get(k-1);
            }
        }
        return answer;
    }
}
