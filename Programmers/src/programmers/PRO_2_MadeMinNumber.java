package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PRO_2_MadeMinNumber {
	class Solution{
	    public int solution(int []A, int []B){
	        int answer = 0;
	        ArrayList<Integer> b = new ArrayList<>();
			for(int i = 0;i<B.length;i++) {
				b.add(B[i]);
			}
			Arrays.sort(A);
			Collections.sort(b,Collections.reverseOrder());
			for(int i = 0;i<A.length;i++) {
				answer+=A[i]*b.get(i);
			}
	        return answer;
	    }
	}

}
