package programmers;

public class PRO_2_N_LCM {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,6,8,14}));
		System.out.println(solution(new int[] {1,2,3}));
	}
	public static int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1;i<arr.length;i++) {
			answer = lcm(answer,arr[i]);
		}
        return answer;
    }
    static int gcd(int a, int b) {
		while(b!=0) {
			int c = a%b;
			a = b;
			b = c;
		}
		return a;
	}
	static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
}
