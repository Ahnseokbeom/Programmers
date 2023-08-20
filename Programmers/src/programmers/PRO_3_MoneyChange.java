package programmers;

public class PRO_3_MoneyChange {
	public static void main(String[] args) {
		int n = 5;
		int[] money = {1,2,5};
		System.out.println(solution(n, money));
	}
	public static int solution(int n, int[] money) {
		int[] arr = new int[100001];
		arr[0] = 1;
		for(int i : money) {
			for(int j = i;j<=n;j++) {
				arr[j] +=arr[j-i];
			}
		}
		int answer = arr[n];
		return answer;
	}

}
