package programmers.PRO1;

public class PRO1_콜라츠추측 {
	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(8));
		System.out.println(solution(626331));
	}
    public static int solution(int num) {
        long n = num;
        int answer = 0;
         while(n!=1){
            if(n%2==0){
                n = n/2;
            }else{
                n = (n*3)+1;
            }
            answer++;
             if(answer==500){
                 answer = -1;
                 break;
             }
        }
        return answer;
    }
}
