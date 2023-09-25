package programmers.PRO2;

public class PRO2_피보나치수 {
	public static void main(String[] args) {
		
		System.out.println(solution(3));
		System.out.println(solution(5));
	}
    public static int solution(int n) {
        int answer = 0;
        if(n==0 || n==1) return 1;
        int num1 = 0;
        int num2 = 1;
        for(int i = 2;i<=n;i++){
            answer = (num1+num2)%1234567;
            num1=num2;
            num2=answer;
        }
        return answer;
    }
}
