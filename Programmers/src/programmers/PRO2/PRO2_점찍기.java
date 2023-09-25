package programmers.PRO2;

public class PRO2_점찍기{
	public static void main(String[] args) {
	
		System.out.println(solution(2,4));
		System.out.println(solution(1,5));
	}
	public static long solution(int k, int d) {
		long answer = 0;
		for(int i = 0;i<=d;i+=k) {
			long a = (long)d*d;
			long b = (long)i*i;
			int res = (int)Math.sqrt(a-b);
			answer += (res/k)+1;
		}
		return answer;
	}
}
