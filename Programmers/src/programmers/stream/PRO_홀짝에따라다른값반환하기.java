package programmers.stream;

import java.util.stream.IntStream;

public class PRO_홀짝에따라다른값반환하기 {
	static int[] arr;
	public static void main(String[] args) {
		System.out.println(solution(7));
		System.out.println(solution(10));
	}
	public static int solution(int n) {
		if(n%2 == 0) {
            return IntStream.rangeClosed(1,n).filter(i->i%2==0).map(i->(int) Math.pow(i,2)).sum();
        }
        return IntStream.rangeClosed(1,n).filter(i->i%2==1).sum();
	}
}
