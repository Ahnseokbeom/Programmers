package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class PRO_1_TwoNumber {
	public static void main(String[] args) {
		int[] num = {2,1,3,4,1};
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0;i<num.length;i++) {
			for(int j = i+1;j<num.length;j++) {
				if(!arr.contains(num[i]+num[j])) {
					arr.add(num[i]+num[j]);
				}
			}
			Collections.sort(arr);
			int[] result = new int[arr.size()];
			for(int k = 0;k<arr.size();k++) {
				result[k] = arr.get(k);
			}
		}
	}
}
