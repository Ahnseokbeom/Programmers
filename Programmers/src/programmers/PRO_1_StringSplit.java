package programmers;

public class PRO_1_StringSplit {
	public static void main(String[] args) {
		String s1 = "banana";
		System.out.println(solution(s1));

		String s2 = "abracadabra";
		System.out.println(solution(s2));

		String s3 = "aaabbaccccabba";
		System.out.println(solution(s3));
	}
	public static int solution(String s) {
        char c = s.charAt(0);
        int first = 0;
        int dif = 0;
        int answer = 0;
        for(int i = 0;i<s.length();i++) {
        	if(first==dif) {
        		answer++;
        		c = s.charAt(i);
        	}
        	if(s.charAt(i)==c) first++;
        	else dif++;
        }
        return answer;
    }

}
