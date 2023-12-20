package programmers.PRO2;

public class PRO2_점찍기{
	public static void main(String[] args) {

		System.out.println(solution(2,4));
		System.out.println(solution(1,5));
	}
	public static long solution(long k, long d) {
		long answer = 0;
		for(long l = 0;l<=d;l+=k) {
			long num = (long)Math.sqrt(d*d - l*l);
			answer += num / k +1;
		}
		return answer;
	}
}
