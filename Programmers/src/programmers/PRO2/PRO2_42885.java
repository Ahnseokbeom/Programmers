package programmers.PRO2;

import java.util.Arrays;

public class PRO2_42885 {
	public static void main(String[] args) {

		System.out.println(solution(new int[] {70,50,80,50}, 100));
		System.out.println(solution(new int[] {70,80,50}, 100));
	}
    public static int solution(int[] people, int limit) {
        int answer = 0;

    Arrays.sort(people);

    int min = 0;

    for (int max = people.length - 1; min <= max; max--){
      if (people[min] + people[max] <= limit) min++;
      answer++;
    }

    return answer;
    }
}
