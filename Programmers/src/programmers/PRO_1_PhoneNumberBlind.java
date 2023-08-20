package programmers;

public class PRO_1_PhoneNumberBlind {
	    public static String solution(String phone_number) {
	    	String answer = "";
	        for(int i = 0;i<phone_number.length()-4;i++) answer +="*";
	        answer += phone_number.substring(phone_number.length()-4,phone_number.length());
	        return answer;
	    }
	public static void main(String[] args) {
		String phone1 = "01033334444";
		System.out.println(solution(phone1));
		String phone2 = "027778888";
		System.out.println(solution(phone2));
	}

}
