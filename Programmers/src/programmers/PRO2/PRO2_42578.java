package programmers.PRO2;

import java.util.HashMap;

public class PRO2_42578 {
	public static void main(String[] args) {
		String[][] t1 = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
		System.out.println(solution(t1));
		
		String[][] t2 = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
		System.out.println(solution(t2));
	}
	public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();

		for(int i = 0;i<clothes.length;i++) {
			String s = clothes[i][1];
			map.put(s, map.getOrDefault(s,1)+1);
		}
		for(String key : map.keySet()) answer *=map.get(key);
		return answer-1;
	}
}
