package programmers;

public class PRO_2_SkillTest1_1 {
	public static void main(String[] args) {
		PRO_2_SkillTest1_1 p = new PRO_2_SkillTest1_1();
		for(int i = 1;i<=10;i++) {
			System.out.println("답 : "+p.solution(i)+" "+i);
		}
	}
//	class Solution {
	    public String solution(int n) {
	    	String[] list = {"4","1","2"};
	    	String answer = "";
	    	while(n>0) {
	    		answer = list[n%3]+answer;
	    		System.out.print("list : "+list[n%3]+" ");
	    		n = n%3 == 0 ? (n-1)/3 : n/3;
	    		System.out.print("answer : "+answer+" ");
	    		System.out.print("n : "+n+" ");
	    	}

	        return answer;
	    }
	}

//}
