package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PRO_2_MineralDig_1 {
	public static void main(String[] args) {
		int[] p1 = {1,3,2};
		String[] m1 = {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
		System.out.println(solution(p1, m1));
		int[] p2 = {0,1,1};
		String[] m2 = {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};
		System.out.println(solution(p2, m2));
	}
	public static int solution(int[] picks, String[] minerals) {
		return IntStream.iterate(0, i -> i < Math.min(minerals.length, Arrays.stream(picks).sum() * 5),  i -> i + 5)
	            .mapToObj(i -> Arrays.stream(Arrays.copyOfRange(minerals, i, Math.min(i + 5, minerals.length)))
	                    .mapToInt(s -> s.charAt(0) == 'd' ? 25 : s.charAt(0) == 'i' ? 5 : 1).toArray())
	            .sorted((a, b) -> Arrays.stream(b).sum() - Arrays.stream(a).sum())
	            .mapToInt(arr -> {
	                int n = picks[0]-- > 0 ? 25 : picks[1]-- > 0 ? 5 : 1;
	                return Arrays.stream(arr).map(i -> Math.max(i / n, 1)).sum();})
	            .sum();
    }

}
