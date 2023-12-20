package programmers.PRO1;

import java.util.Arrays;

public class PRO1_133499 {
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"aya","yee","u","maa"}));
		System.out.println(solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));

		System.out.println(solutionStream(new String[] {"aya","yee","u","maa"}));
		System.out.println(solutionStream(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
	}
	public static int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0;i<babbling.length;i++) {
        	String s = babbling[i];
        	if(s.contains("ayaaya") || s.contains("mama") || s.contains("woowoo") || s.contains("yeye")) continue;
        	s = s.replace("aya", "");
        	s = s.replace("ma", "");
        	s = s.replace("woo", "");
        	s = s.replace("ye", "");
        	if(s.length()==0) answer++;
        }
        return answer;
    }
	public static int solutionStream(String[] babbling) {
		return (int) Arrays.stream(babbling)
                .filter(s -> !s.matches(".*(aya){2,}.*|.*mama.*|.*(woo){2,}.*|.*(ye){2,}.*"))
                .map(s -> s.replace("aya", " ").replace("ma", " ").replace("woo", " ").replace("ye", " ").replace(" ",""))
                .filter(s -> s.isEmpty())
                .count();
	}

}
