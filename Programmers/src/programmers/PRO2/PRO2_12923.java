package programmers.PRO2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRO2_12923 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(1, 10)));
		System.out.println(Arrays.toString(solution(2, 100000)));
	}
		public static int[] solution(long begin, long end) {
		      int[] answer = new int[(int)(end - begin) + 1];
		      int idx = 0;
		      for (int i = (int)begin; i <= end; i++) answer[idx++] = MaxDivisor(i);

		      return answer;
		}
	   public static int MaxDivisor(int x) {
	      if (x == 1) {
	         return 0;
	      }

	      List<Integer> list = new ArrayList<>();

	      for (int i = 2; i <= Math.sqrt(x); i++) {
	         if (x % i == 0) {
	            list.add(i);
	            if (x / i <= 10000000) {
	               return x/i;
	            }
	         }
	      }

	      if (!list.isEmpty()) {
	         return list.get(list.size() - 1);
	      }

	      return 1;
	   }
}
