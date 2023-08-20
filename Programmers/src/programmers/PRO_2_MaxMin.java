package programmers;

import java.util.Arrays;

public class PRO_2_MaxMin {
	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
		System.out.println(solution("-1 -2 -3 -4"));
		System.out.println(solution("-1 -1"));
	}
	public static String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        answer += String.valueOf(arr[0])+" "+String.valueOf(arr[arr.length-1]);
        return answer;
    }
}
