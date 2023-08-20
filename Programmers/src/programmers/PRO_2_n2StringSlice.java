package programmers;

public class PRO_2_n2StringSlice {
	public int[] solution(int n, long left, long right) {
		int[] answer = new int[(int)(right-left)+1];

		int num = 0;
		for(long i = left;i<=right;i++) {
			long row = i/n;
			long col = i%n;
			answer[num++] = Math.max((int)row, (int)col)+1;
		}
		return answer;
	}

}
