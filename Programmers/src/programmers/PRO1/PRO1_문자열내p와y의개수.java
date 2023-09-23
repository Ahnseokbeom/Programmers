package programmers.PRO1;

public class PRO1_문자열내p와y의개수 {
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}
    public static boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int p = s.length()-s.replace(String.valueOf("p"), "").length();
        int y = s.length()-s.replaceAll(String.valueOf("y"), "").length();
        if(p==y) {
        	answer = true;
        }else {
        	answer = false;
        }

        return answer;
    }
}
