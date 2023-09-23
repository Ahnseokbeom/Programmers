package programmers.PRO1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PRO1_신고결과받기 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(new String[] {"muzi", "frodo", "apeach", "neo"},
				new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2)));
		System.out.println(Arrays.toString(solution(new String[] {"con", "ryan"},
				new String[] {"ryan con", "ryan con", "ryan con", "ryan con"}, 3)));
	}
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        	       Map<String, Integer> index = new HashMap<>();
	        Map<String, List<Integer>> list = new HashMap<>();

	        for(int i=0 ; i<id_list.length ; i++) {
				index.put(id_list[i],i);
			}

	        for(String rep : report) {
	        	String[] ids = rep.split(" ");
	        	String fromId=ids[0], toId=ids[1];
	        	if(!list.containsKey(toId)) list.put(toId, new ArrayList<>());
	        	List<Integer> tmp = list.get(toId);
	        	if(!tmp.contains(index.get(fromId))) tmp.add(index.get(fromId));
	        }

	        for(int i=0 ; i<id_list.length ; i++) {
	        	String id = id_list[i];
	        	if(list.containsKey(id) && list.get(id).size()>=k) {
		        	for(int idx : list.get(id)) {
		        		answer[idx]++;
		        	}
	        	}
	        }
        return answer;
    }
}
