package programmers.PRO1;

public class PRO1_86051 {
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {1,2,3,4,6,7,8,0}));
		System.out.println(solution(new int[] {5,8,4,0,6,7,9}));
	}
    public static int solution(int[] numbers) {
    	int sum = 0;
    	for(int n : numbers) {
    		sum+=n;
    	}
    	return 45-sum;
    }
}
