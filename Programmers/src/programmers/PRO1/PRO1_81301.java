package programmers.PRO1;

public class PRO1_81301 {
	static String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	static String[] index = {"0","1","2","3","4","5","6","7","8","9"};
	public static void main(String[] args) {
		
		System.out.println(solution("one4seveneight"));
		System.out.println(solution("23four5six7"));
		System.out.println(solution("2three45sixseven"));
		System.out.println(solution("123"));
	}
	public static int solution(String s) {
		for(int i = 0;i<num.length;i++) s = s.replace(num[i], index[i]);
		return Integer.parseInt(s);
	}
}
