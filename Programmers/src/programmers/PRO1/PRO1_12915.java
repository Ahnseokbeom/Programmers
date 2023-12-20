package programmers.PRO1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PRO1_12915 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(new String[] {"sun", "bed", "car"}, 1)));
		System.out.println(Arrays.toString(solution(new String[] {"abce", "abcd", "cdx"}, 2)));
	}
	public static String[] solution(String[] strings, int n) {
        String[] answer = {};
         ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}
