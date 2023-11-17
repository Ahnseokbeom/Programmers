package programmers.PRO2;

import java.math.BigInteger;

public class PRO2_멀쩡한사각형 {
	public static void main(String[] args) {
		System.out.println(solution(8, 12));
	}
	 public static long solution(int w, int h) {
        long totalCount = (long) w * (long) h;
        long diagonalCount = w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).longValue();

        return totalCount - diagonalCount;
    }
}
