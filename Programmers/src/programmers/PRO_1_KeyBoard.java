package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class PRO_1_KeyBoard {
	public static void main(String[] args) {
		String[] keymap1 = {"ABACD","BCEFD"};
		String[] targets1 = {"ABCD","AABB"};
		System.out.println(Arrays.toString(solution(keymap1, targets1)));

		String[] keymap2 = {"AA"};
		String[] targets2 = {"B"};
		System.out.println(Arrays.toString(solution(keymap2, targets2)));

		String[] keymap3 = {"AGZ", "BSSS"};
		String[] targets3 = {"ASA","BGZ"};
		System.out.println(Arrays.toString(solution(keymap3, targets3)));
	}
	public static int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		HashMap<Character, Integer> map = new HashMap<>();
		for(String key : keymap) {
			for(int i = 0;i<key.length();i++) {
				char c = key.charAt(i);
				if(!map.containsKey(c) || i<map.get(c))map.put(c, i+1);
			}
		}
		for(int i = 0;i<targets.length;i++) {
			int count = 0;
			for(int j = 0;j<targets[i].length();j++) {
				char c = targets[i].charAt(j);
				if(!map.containsKey(c)) {
					count = 0;
					break;
				}else count+=map.get(c);
			}
			answer[i] = count == 0?-1:count;
		}
		return answer;
	}

}
