package programmers.PRO1;

import java.util.HashMap;
import java.util.Map;

public class PRO1_258712 {
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"muzi", "ryan", "frodo", "neo"},
				new String[] {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}));
		System.out.println(solution(new String[] {"joy", "brad", "alessandro", "conan", "david"},
				new String[] {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"}));
		System.out.println(solution(new String[] {"a","b","c"}, new String[] {"a b", "b a", "c a", "a c", "a c", "c a"}));

	}
	public static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String,Integer> gift = new HashMap<>();
        Map<String, Integer> recive = new HashMap<>();
        for(int i = 0;i<friends.length;i++) {
        	gift.put(friends[i], 0);
        	recive.put(friends[i], 0);
        }
        for(int i = 0;i<gifts.length;i++) {
        	String[] arr = gifts[i].split(" ");
        	gift.put(arr[0], gift.getOrDefault(arr[0], 0)+1);
        	recive.put(arr[1],recive.getOrDefault(arr[1],0)+1);
        }
        for(int i = 0;i<friends.length;i++) {
        	System.out.println(gift.get(friends[i])-recive.get(friends[i]));
        }
        System.out.println(gift);
        return answer;
    }
}
