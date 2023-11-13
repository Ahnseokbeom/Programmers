package programmers.PRO3;

public class PRO3_스티커모으기2 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {14, 6, 5, 11, 3, 9, 2, 10}));
		System.out.println(solution(new int[] {1,3,2,5,4}));
	}
	public static int solution(int[] sticker) {
        int n = sticker.length;

        if (n == 1) {
            return sticker[0];
        }

        int[] dp1 = new int[n]; // 첫 번째 스티커를 선택한 경우
        int[] dp2 = new int[n]; // 첫 번째 스티커를 선택하지 않은 경우

        // 첫 번째 스티커를 선택한 경우
        dp1[0] = sticker[0];
        dp1[1] = sticker[0];
        for (int i = 2; i < n - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + sticker[i]);
        }

        // 첫 번째 스티커를 선택하지 않은 경우
        dp2[0] = 0;
        dp2[1] = sticker[1];
        for (int i = 2; i < n; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + sticker[i]);
        }

        return Math.max(dp1[n - 2], dp2[n - 1]);
    }
}
