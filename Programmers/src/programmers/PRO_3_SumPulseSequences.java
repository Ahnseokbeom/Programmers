package programmers;

public class PRO_3_SumPulseSequences {
	public static void main(String[] args) {
		int[] sequence = {2, 3, -6, 1, 3, -1, 2, 4};
		System.out.println(solution(sequence));
	}
	public static long solution(int[] sequence) {
        long answer = 0;
        long[] minusDP = new long[sequence.length];
        long[] plusDP = new long[sequence.length];

        int minus = -1;
        int plus = -1;
        for(int i = 0;i<sequence.length;i++) {
        	int minusSeq = sequence[i]*minus;
        	int plusSeq = sequence[i]*plus;
        	if(i==0) {
        		minusDP[i] = minusSeq;
        		plusDP[i] = plusSeq;
        	}else {
        		minusDP[i] = Math.max(minusDP[i-1]+minusSeq, minusSeq);
        		plusDP[i] = Math.max(plusDP[i-1]+plusSeq, plusSeq);
        	}
        	minus*=-1;
        	plus*=-1;
        	answer = Math.max(answer, minusDP[i]);
        	answer = Math.max(answer, plusDP[i]);
        }
        return answer;
    }

}
