package programmers;

import java.util.ArrayList;

public class PRO_2_NJinsuGame {
	public static void main(String[] args) {
		System.out.println(solution(2, 4, 2, 1));
		System.out.println(solution(16, 16, 2, 1));
		System.out.println(solution(16, 16, 2, 2));

	}
	public static String solution(int n, int t, int m, int p) {

        StringBuilder answer = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < t * m; i++) {
            String conv = change(i, n);
            for (char c : conv.toCharArray()) {
                list.add(c);
            }
        }

        for (int i = p - 1; i < t * m; i += m) {
            answer.append(list.get(i));
        }

        return answer.toString();
    }
	private static String change(int i, int n) {
        char[] arr = "0123456789ABCDEF".toCharArray();
        int q = i / n;
        int r = i % n;

        if (q == 0) {
            return Character.toString(arr[r]);
        } else {
            return change(q, n) + arr[r];
        }
    }
}
