package programmers.PRO1;

public class PRO1_정수제곱근판별 {
	public static void main(String[] args) {
		
		System.out.println(solution(121L));
		System.out.println(3L);
	}
    public static long solution(long n) {
        long answer = 0;
        double d = Math.sqrt(n)+1;
        if(d-(int)d==0){
            answer = (long)Math.pow((long)d,2);
        }else{
            answer = -1;
        }
        return answer;
    }
}
