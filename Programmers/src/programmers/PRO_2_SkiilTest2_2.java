package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PRO_2_SkiilTest2_2 {
	public static void main(String[] args) {
		PRO_2_SkiilTest2_2 p= new PRO_2_SkiilTest2_2();
		String msg = "KAKAO";
		System.out.println(Arrays.toString(p.solution(msg)));
	}
//	class Solution {
	    public int[] solution(String msg) {
	    	HashMap<String, Integer> map = new HashMap<>();
	    	ArrayList<Integer> list = new ArrayList<>();
	    	char c = 'A';
	    	for(int i = 1;i<=26;i++) {
	    		map.put(c+"", i);
	    		c+=1;
	    	}
	    	int add = 27;
	    	boolean check = false;
	    	for(int i = 0;i<msg.length();i++) {
	    		String st = msg.charAt(i)+"";
	    		while(map.containsKey(st)) {
	    			i++;
	    			if(i==msg.length()) {
	    				check = true;
	    				break;
	    			}
	    			st+=msg.charAt(i)+"";
	    		}
	    		if(check) {
	    			list.add(map.get(st));
	    			break;
	    		}
	    		list.add(map.get(st.substring(0,st.length()-1)));
	    		map.put(st, add++);
	    		i--;
	    	}
	    	int[] answer = new int[list.size()];
	    	for(int j = 0;j<list.size();j++) {
	    		answer[j] = list.get(j);
	    	}

	        return answer;
	    }
	}
//}
