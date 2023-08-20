package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PRO_2_MandarinChoose {
	public static void main(String[] args) {
		int k1 = 6;
		int[] tan1 = {1, 3, 2, 5, 4, 5, 2, 3};
		System.out.println(solution(k1,tan1));

		int k2 = 4;
		int[] tan2 = {1, 3, 2, 5, 4, 5, 2, 3};
		System.out.println(solution(k2,tan2));

		int k3 = 2;
		int[] tan3 = {1,1,1,1,2,2,2,3};
		System.out.println(solution(k3,tan3));
	}
	public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tangerine) map.put(i, map.getOrDefault(i, 0)+1);

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list,new Comparator<Integer>() {
        	@Override
        	public int compare(Integer o1, Integer o2) {
    			return map.get(o2).compareTo(map.get(o1));
    		}
		});
        for(Integer i : list) {
        	if(k <= 0)break;
        	answer++;
        	k-=map.get(i);
        }
        return answer;
    }

}
