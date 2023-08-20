package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO_2_PhoneNumberList {
	public static void main(String[] args) {
		String[] phone_book = {"123","456","789"};
//		String[] phone_book = {"12","123","1235","567","88"};
//		String[] phone_book = {"12","123","23"};
		ArrayList<String> arr = new ArrayList<>();
		Arrays.sort(phone_book);
		boolean answer = true;
		for(int i = 0;i<phone_book.length-1;i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) {
				answer = false;
			}
		}
		System.out.println(answer);
	}

}
