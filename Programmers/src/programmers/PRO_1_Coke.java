package programmers;

public class PRO_1_Coke {
	public int solution(int a, int b, int n) {
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
