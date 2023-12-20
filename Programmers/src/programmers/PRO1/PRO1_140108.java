package programmers.PRO1;

public class PRO1_140108 {
	public static void main(String[] args) {
		
		System.out.println(solution("banana"));
		System.out.println(solution("abracadabra"));
		System.out.println(solution("aaabbaccccabba"));
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
