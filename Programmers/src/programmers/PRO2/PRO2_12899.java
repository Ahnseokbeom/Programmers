package programmers.PRO2;

public class PRO2_12899 {
	public static void main(String[] args) {
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	public static String solution(int n) {
		String answer = "";
		String[] s = {"4","1","2"};
		while(n>0) {
			answer = s[n%3]+answer;
			n = n%3==0 ? (n-1)/3:n/3;
		}
		return answer;
	}
}
