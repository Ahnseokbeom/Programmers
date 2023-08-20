package programmers;

public class PRO_2_TargetNumber {
	static int answer = 0;
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,1,1,1,1},3));
		System.out.println(solution(new int[] {4,1,2,1},4));
	}
	public static int solution(int[] numbers, int target) {
		dfs(numbers,target,0,0);
		return answer;
	}
	public static void dfs(int[] numbers, int t, int d, int sum){
        if(d == numbers.length){
            if(sum == t) answer++;
        }else{
            dfs(numbers, t, d+1, sum+numbers[d]);
            dfs(numbers, t, d+1, sum-numbers[d]);
        }
    }

}
