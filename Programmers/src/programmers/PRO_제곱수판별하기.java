package programmers;

public class PRO_제곱수판별하기 {
	public static void main(String[] args) {
		System.out.println(solution(144));
		System.out.println(solution(976));
	}
	public static int solution(int n) {
		return Math.sqrt(n)%1==0?1:2;
	}
}
