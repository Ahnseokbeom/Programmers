package programmers.PRO2;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO2_전화번호목록 {
	public static void main(String[] args) {
		
		System.out.println(solution(new String[] {"123","456","789"}));
		System.out.println(solution(new String[] {"12","123","1235","567","88"}));
		System.out.println(solution(new String[] {"12","123","23"}));
	}
	public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
		for(int i = 0;i<phone_book.length-1;i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) {
				return false;
			}
		}
        return true;
    }
}
