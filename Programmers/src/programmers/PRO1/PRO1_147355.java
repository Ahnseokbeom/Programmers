package programmers.PRO1;

public class PRO1_147355 {
	public static void main(String[] args) {
		
		System.out.println(solution("3141592", "271"));
		System.out.println(solution("500220839878"	, "7"));
		System.out.println(solution("10203", "15"));
	}
	public static int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
		long b = Long.parseLong(p);
		for(int i = 0;i<t.length()-len+1;i++) {
			long a = Long.parseLong(t.substring(i, len+i));
			if(a <= b) {
				answer++;
			}
		}
        return answer;
    }
}
