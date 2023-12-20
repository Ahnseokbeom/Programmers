package programmers.PRO2;

import java.util.HashMap;
import java.util.Map;

public class PRO2_17677 {
	public static void main(String[] args) {
		System.out.println(solution("FRANCE", "french"));
		System.out.println(solution("handshake", "shake hands"));
		System.out.println(solution("aa1+aa2", "AAAA12"));
		System.out.println(solution("E=M*C^2", "e=m*c^2"));
	}
	 public static int solution(String str1, String str2) {
	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();

	        Map<String, Integer> map1 = makeMultiSet(str1);
	        Map<String, Integer> map2 = makeMultiSet(str2);

	        int n = 0;
	        int union = 0;

	        for (String key : map1.keySet()) {
	            if (map2.containsKey(key)) {
	                n += Math.min(map1.get(key), map2.get(key));
	            }
	        }

	        for (String key : map1.keySet()) union += map1.get(key);

	        for (String key : map2.keySet()) union += map2.get(key);

	        if (union == 0) {
	            return 65536;
	        }
	        double mod = (double) union - n;
	        double num = n / mod;
	        int answer = (int) (num * 65536);

	        return answer;
	    }

    public static Map<String, Integer> makeMultiSet(String str) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length() - 1; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);

            if (Character.isLetter(first) && Character.isLetter(second)) {
                String s = String.valueOf(first) + String.valueOf(second);
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        return map;
    }
}
