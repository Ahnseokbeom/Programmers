package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PRO_2_MandarinSelect {
	public static void main(String[] args) {
		int k1 = 6;
		int[] tang1 = {1,3,2,5,4,5,2,3};
		System.out.println(solution(k1, tang1));

		int k2 = 4;
		int[] tang2 = {1,3,2,5,4,5,2,3};
		System.out.println(solution(k2, tang2));

		int k3 = 2;
		int[] tang3 = {1,1,1,1,2,2,2,3};
		System.out.println(solution(k3, tang3));
	}
	public static int solution(int k, int[] tangerine) {
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
