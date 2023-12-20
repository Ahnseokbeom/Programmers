package programmers.PRO1;

import java.util.regex.Pattern;

public class PRO1_12918 {
	public static void main(String[] args) {
		
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}
    public static boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4 && s.length()!=6) answer = false;
        else{
        String pattern = "^[a-z,A-Z,가-힇]";
        for(int i = 0;i<s.length();i++){
            if(Pattern.matches(pattern, s.charAt(i)+"")){
                answer = false; break;
             }
         }
        }
        return answer;
    }
}
