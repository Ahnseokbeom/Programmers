package programmers.PRO4;

public class PRO4_쿠키구입 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,1,2,3}));
		System.out.println(solution(new int[] {1,2,4,5}));
	}
	 public static int solution(int[] cookie) {
        int answer = 0;
         for (int i = 1; i < cookie.length; i++) {
            int left = i - 1;
            int right = i;
            int leftSum = cookie[left];
            int rightSum = cookie[right];

            while (left >= 0 && right < cookie.length) {
                if (leftSum == rightSum) {
                    answer = Math.max(answer, leftSum);
                }
                if (leftSum < rightSum) {
                    left--;
                    if (left >= 0) leftSum += cookie[left];
                } else {
                    right++;
                    if (right < cookie.length) rightSum += cookie[right];
                }
            }
        }
        return answer;
    }
}
