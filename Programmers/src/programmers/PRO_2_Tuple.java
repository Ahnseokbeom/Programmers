package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PRO_2_Tuple {
	public ArrayList<Integer> solution(String s){
		ArrayList<Integer> answer = new ArrayList<>();
		s = s.substring(2,s.length());
		s = s.substring(0,s.length()-2).replace("},{","-");
		String str[] = s.split("-");
		Arrays.sort(str,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		for(String st : str) {
			String[] temp = st.split(",");

			for(int i = 0;i<temp.length;i++) {
				int n = Integer.parseInt(temp[i]);
				if(!answer.contains(n)) answer.add(n);
			}
		}
		return answer;
	}
}
