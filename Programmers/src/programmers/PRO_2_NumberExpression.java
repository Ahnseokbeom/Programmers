package programmers;

public class PRO_2_NumberExpression {
	public static void main(String[] args) {
		int n = 5;
		int answer = 0;
		for(int i = 1;i<=n;i++) {
			int sum = 0;
			for(int j = i;j<=n;j++) {
				sum+=j;
				if(sum==n) {
					answer++;
					break;
				}
				if(sum>n) break;
			}
		}
		System.out.println(answer);
	}

}
