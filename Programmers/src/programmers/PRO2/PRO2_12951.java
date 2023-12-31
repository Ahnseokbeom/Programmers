package programmers.PRO2;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO2_12951 {
	static String answer = "";
	static ArrayList<String> arr;
	
	public static void main(String[] args) {
		
		System.out.println(solution("3people unFollowed me"));
		System.out.println(solution("for the last week"));
	}
    public static String solution(String s) {
    	JadenCase(s);
        if(answer.length()!=s.length()) {
			for(int i = 0;i<s.length()-answer.length();i++) {
				answer+=' ';
			}
		}
        arr.clear();
        return answer;
	}
	public static void JadenCase(String s) {
		String[] str = s.split(" ");
        arr = new ArrayList<>(Arrays.asList(str));
        for(int i = 0;i<arr.size();i++) {
			char c = arr.get(i).length()==0?'!':arr.get(i).charAt(0);
			if(c=='!') {
				answer+=' ';
				continue;
			}else {
				if(c>='a' || c<='z' || c>='A' || c<='Z') {
					answer+= arr.get(i).substring(0,1).toUpperCase();
				}else {
					answer+=c;
				}
				answer+=arr.get(i).substring(1,arr.get(i).length()).toLowerCase();
				if(i==arr.size()-1) {
					break;
				}else {
					answer+=" ";
				}
			}
		}
	}
}
