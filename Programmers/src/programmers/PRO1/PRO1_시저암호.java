package programmers.PRO1;

public class PRO1_시저암호 {
	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
	}
	public static String solution(String s, int n) {
        String answer = "";
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' ') answer+= c;
            if(c >='a' && c <= 'z'){
                if(c+n>'z')answer+=(char)(c-26+n);
                else answer +=(char)(c+n);
            }else if(c>='A' && c<='Z'){
                if(c+n>'Z') answer+=(char)(c-26+n);
                else answer+=(char)(c+n);
            }
        }
        return answer;
    }

}
