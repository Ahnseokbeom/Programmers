package programmers.PRO1;

import java.util.Arrays;

public class PRO1_42576 {
	public static void main(String[] args) {
		
		System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		System.out.println(solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
		System.out.println(solution(new String[] {"mislav", "stanko", "mislav", "ana"},new String[] {"stanko", "ana", "mislav"}));
	}
    public static String solution(String[] participant, String[] completion) {
    	String answer = "";
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	int i =0;
    	for(;i<completion.length;i++) {
    		if(!participant[i].equals(completion[i])) {
    			return participant[i];
    		}

    	}
    	answer = participant[i];
    	return answer;
    }
}
