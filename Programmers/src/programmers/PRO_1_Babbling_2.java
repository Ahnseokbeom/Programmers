package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO_1_Babbling_2 {
	static String[] str = {"aya", "ye", "woo", "ma"};
	public static void main(String[] args) {


		String[] b1 = {"aya", "yee", "u", "maa"};
		System.out.println(solution(b1));

		String[] b2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		System.out.println(solution(b2));
	}
	public static int solution(String[] babbling) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(babbling));
        System.out.println(list);
        System.out.println(list.get(0).contains(str[0]));
        return answer;
    }

}
