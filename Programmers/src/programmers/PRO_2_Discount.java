package programmers;

import java.util.HashMap;
import java.util.Map;

public class PRO_2_Discount {
	public static void main(String[] args) {
		String[] want1 = {"banana", "apple", "rice", "pork", "pot"};
		int[] number1 = {3,2,2,2,1};
		String[] discount1 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

		System.out.println(solution(want1,number1,discount1));

		String[] want2 = {"apple"};
		int[] number2 = {10};
		String[] discount2 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};

		System.out.println(solution(want2,number2,discount2));

	}
	public static int solution(String[] want, int[] number, String[] discount) {
		Map<String, Integer> wantMap = new HashMap<>();
		int answer = 0;
        int wantLength = want.length;
        for (int i = 0; i < wantLength; i++) {
            wantMap.put(want[i], number[i]);
        }

        int discountLength = discount.length;
        for (int i = 0; i <= discountLength - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = 0; j < 10; j++) {
                String item = discount[i + j];
                int count = discountMap.getOrDefault(item, 0);
                count++;
                discountMap.put(item, count);
            }
            boolean check = true;
            for (String wantItem : wantMap.keySet()) {
                int wantCount = wantMap.get(wantItem);
                int discountCount = discountMap.getOrDefault(wantItem, 0);
                if (wantCount > discountCount) {
                    check = false;
                    break;
                }
            }
            if (check) {
                answer++;
            }
        }
        return answer;
    }

}
