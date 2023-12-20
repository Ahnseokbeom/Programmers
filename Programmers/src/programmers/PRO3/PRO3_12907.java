package programmers.PRO3;

public class PRO3_거스름돈 {
	public static void main(String[] args) {
		
		System.out.println(solution(5, new int[] {1,2,5}));
	}
	public static int solution(int n, int[] money) {
		int[] arr = new int[100001];
		arr[0] = 1;
		for(int i : money) for(int j = i;j<=n;j++) arr[j] +=arr[j-i];
		int answer = arr[n];
		return answer;
	}
}
