package programmers.PRO1;

public class PRO1_이상한문자만들기 {
	public static void main(String[] args) {
		String s = "try hello world";
		System.out.println(solution(s));
	}
	public static String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else{
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        } 
        
        return answer;
    }
}
