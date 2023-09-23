package programmers.PRO1;

public class PRO1_콜라문제 {
	public static void main(String[] args) {
		System.out.println(solution(2, 1, 20));

		System.out.println(solution(3, 1, 20));
	}
	public static int solution(int a, int b, int n) {
        int result = 0;
		int answer = 0;
		while(true) {
            if(n<a) break;
			answer+=(n/a)*b;
            result = n%a;
			n = (n/a)*b+result;
		}
        return answer;
    }
}
