package programmers.PRO1;

import java.util.Arrays;
import java.util.Collections;

public class PRO1_12917 {
	public static void main(String[] args) {
		
		System.out.println(solution("Zbcdefg"));
	}
    public static String solution(String s) {
        String answer = "";
        String[] str = new String[s.length()];
        for(int i = 0;i<s.length();i++){
            str[i] = s.charAt(i)+"";
        }
        Arrays.sort(str,Collections.reverseOrder());
        for(int i = 0;i<str.length;i++) {
        	answer+=str[i];
        }
        return answer;
    }
}
