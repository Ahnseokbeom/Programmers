package programmers.PRO2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PRO2_귤고르기 {
	public static void main(String[] args) {

		System.out.println(solution1(6,new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
		System.out.println(solution1(4,new int[] {1, 3, 2, 5, 4, 5, 2, 3}));
		System.out.println(solution1(2,new int[]{1,1,1,1,2,2,2,3}));
	}
	public static int solution1(int k, int[] tangerine) {
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
	public static int solution2(int k, int[] tangerine) {
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for(int size : tangerine) map.put(size, map.getOrDefault(size, 0)+1);

		ArrayList<Integer> list = new ArrayList<>(map.keySet());

		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int a = map.get(o1);
				int b = map.get(o2);
				if(a==b) return 0;
				else if (a < b) return 1;
				else return -1;
			}
		});

		int i = 0;
		System.out.println(map);
		System.out.println(list);
		while(k>0) {
			k -= map.get(list.get(i));
			answer++;
			i++;
		}
		return answer;
	}
}
