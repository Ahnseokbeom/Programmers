package programmers.PRO1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PRO1_150370 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("2022.05.19", new String[] {"A 6", "B 12", "C 3"},
				new String[] {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
		System.out.println(Arrays.toString(solution("2020.01.01", new String[] {"Z 3", "D 5"},
				new String[] {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"})));
	}
    public static int[] solution(String today, String[] terms, String[] privacies) {
        String[] todayWords = today.split("\\.");
        int y = Integer.parseInt(todayWords[0]);
        int m = Integer.parseInt(todayWords[1]);
        int d = Integer.parseInt(todayWords[2]);
        LocalDate tdy = LocalDate.of(y, m, d);

        Map<String, String> termMap = new HashMap<>();
        for (String term : terms) {
            String[] words = term.split(" ");
            String alpha = words[0];
            String month = words[1];

            termMap.put(alpha, month);
        }

        List<Integer> tempList = new ArrayList<>();
        int idx = 1;
        for (String privacy : privacies) {
            String[] words = privacy.split(" ");
            String date = words[0];
            String alpha = words[1];
            if (isDestroied(tdy, date, termMap.get(alpha))) {
                tempList.add(idx);
            }
            idx++;
        }

        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }

        return answer;
    }

    private static boolean isDestroied(LocalDate tdy, String date, String period) {
        String[] words = date.split("\\.");
        int y = Integer.parseInt(words[0]);
        int m = Integer.parseInt(words[1]);
        int d = Integer.parseInt(words[2]);

        LocalDate getDate = LocalDate.of(y, m, d);
        LocalDate afterDate = getDate.plusMonths(Integer.parseInt(period));

        return afterDate.isBefore(tdy) || afterDate.isEqual(tdy);
    }
}
