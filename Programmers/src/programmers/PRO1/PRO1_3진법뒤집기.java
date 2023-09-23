package programmers.PRO1;

public class PRO1_3진법뒤집기 {
	public static void main(String[] args) {
		
		System.out.println(solution(45));
		System.out.println(solution(125));
	}
    public static int solution(int n) {
        String answer = "";
        while(n!=0){
            answer+=n%3;
            n/=3;
        }
        return Integer.parseInt(answer,3);
    }
}
