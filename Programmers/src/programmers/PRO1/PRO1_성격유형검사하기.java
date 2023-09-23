package programmers.PRO1;

import java.util.HashMap;

public class PRO1_성격유형검사하기 {
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5}));
		System.out.println(solution(new String[] {"TR", "RT", "TR"}, new int[] {7,1,3}));
	}
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] type = {'R','T','C','F','J','M','A','N'};
        HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0;i<type.length;i++) {
			map.put(type[i], 0);
		}
		for(int i = 0;i<choices.length;i++) {
			int p = 0;
			switch(choices[i]) {
			case 1: case 7: p=3; break;
			case 2: case 6: p=2; break;
			case 3: case 5: p=1; break;
			}
			if(choices[i]>4) map.put(survey[i].charAt(1), map.get(survey[i].charAt(1))+p);
			else map.put(survey[i].charAt(0),map.get(survey[i].charAt(0))+p);
		}
        for(int i = 0;i<type.length;i+=2) {
			if(map.get(type[i])<map.get(type[i+1])) {
				answer+=type[i+1];
			}else {
				answer+=type[i];
			}
		}
        return answer;
    }
}
