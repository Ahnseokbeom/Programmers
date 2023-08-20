package programmers;

public class PRO_1_DeckOfCards {
	public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx1Max = cards1.length;
        int idx2 = 0;
        int idx2Max = cards2.length;

        for(int i = 0;i<goal.length;i++) {
        	String s = goal[i];
        	if(idx1 < idx1Max && s.equals(cards1[idx1]))idx1++;
        	else if(idx2 < idx2Max && s.equals(cards2[idx2])) idx2++;
        	else answer = "No";
        }
        return answer;
    }
	public static void main(String[] args) {
		String[] c1 = {"i", "drink", "water"};
		String[] c2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};

		System.out.println(solution(c1,c2,goal));
		String[] c1_1 = {"i", "water", "drink"};
		String[] c2_1 = {"want", "to"};
		String[] goal2 = {"i", "want", "to", "drink", "water"};
		System.out.println(solution(c1_1,c2_1,goal2));
	}

}
