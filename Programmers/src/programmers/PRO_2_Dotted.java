package programmers;

public class PRO_2_Dotted {
	public static void main(String[] args) {
		int k1 = 2;
		int d1 = 4;
		System.out.println(solution(k1, d1));

		int k2 = 1;
		int d2 = 5;
		System.out.println(solution(k2, d2));
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
