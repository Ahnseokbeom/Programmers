package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO_2_SequencePartialSum {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1,2,3,4,5}, 7)));
		System.out.println(Arrays.toString(solution(new int[] {1,1,1,2,3,4,5}, 5)));
		System.out.println(Arrays.toString(solution(new int[] {2,2,2,2,2}, 6)));
	}
	public static int[] solution(int[] sequence, int k) {
        ArrayList<int[]> answer = new ArrayList<>();
        int sum = 0;
        int left = 0;
        int right = -1;
        while (true) {
            if (sum < k) {
            	right += 1;
                if (right >= sequence.length) {
                    break;
                }
                sum += sequence[right];
            } else {
                sum -= sequence[left];
                if (left >= sequence.length) {
                    break;
                }
                left += 1;
            }
            if (sum == k) {
                answer.add(new int[]{left, right});
            }
        }
        answer.sort((o1, o2) -> {
            int n1 = o1[1] - o1[0];
            int n2 = o2[1] - o2[0];
            if (n1 != n2) {
                return Integer.compare(n1,n2);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        return answer.get(0);
    }
}
