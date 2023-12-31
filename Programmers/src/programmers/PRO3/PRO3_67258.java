package programmers.PRO3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class PRO3_67258 {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"})));
		System.out.println(Arrays.toString(solution(new String[]{"AA", "AB", "AC", "AA", "AC"})));
		System.out.println(Arrays.toString(solution(new String[]{"XYZ", "XYZ", "XYZ"})));
		System.out.println(Arrays.toString(solution(new String[]{"ZZZ", "YYY", "NNNN", "YYY", "BBB"})));
	}
	public static int[] solution(String[] gems) {
		HashSet<String> set = new HashSet<>(Arrays.asList(gems));
		HashMap<String, Integer> map = new HashMap<>();
		Queue<String> q = new LinkedList<>();
		if(set.size()==1) return new int[] {1,1};
		int start = 0;
		int temp = 0;
		int min = Integer.MAX_VALUE;
		for(String s : gems) {
			q.add(s);
			map.put(s, map.getOrDefault(s, 0)+1);
			while(true) {
				String tmp = q.peek();
				if(map.get(tmp)>1) {
					map.put(tmp, map.get(tmp)-1);
					q.poll();
					temp++;
				}else break;
			}
			if(map.size()==set.size() && min > q.size()) {
				min = q.size();
				start = temp;
			}
		}
		int[] answer = new int[2];
		answer[0] = start+1;
		answer[1] = start+min;
		return answer;
	}

}
