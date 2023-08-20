package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PRO_1_StringMySort {
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		String[] answer;
		int n = 1;
		 ArrayList<String> arr = new ArrayList<>();
	        for (int i = 0; i < strings.length; i++) {
	            arr.add("" + strings[i].charAt(n) + strings[i]);
	        }
	        Collections.sort(arr);
	        answer = new String[arr.size()];
	        for (int i = 0; i < arr.size(); i++) {
	            answer[i] = arr.get(i).substring(1, arr.get(i).length());
	        }
		System.out.println(Arrays.toString(answer));
	}

}
