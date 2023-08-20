package programmers;

public class PRO_2_124 {
	public static void main(String[] args) {
		String answer = "";
		int n = 9;
		String[] s = {"4","2","1"};
		System.out.println(n%3);
		System.out.println(n/3);
		while(n!=1) {
			answer = s[n%3]+answer;
			n = n%3==0 ? (n-1)/3:n/3;
		}
		System.out.println(answer);
	}

}
