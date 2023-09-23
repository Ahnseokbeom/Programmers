package programmers.PRO1;

public class PRO1_약수의개수와덧셈 {
	public static void main(String[] args) {
		
		System.out.println(solution(13, 17));
		System.out.println(solution(24, 27));
	}
    public static int solution(int left, int right) {
    	 int answer = 0;
    	 int minus = right-left;
    	 int min = left;

    	 for(int i = 0;i<=minus;i++) {
    		 int count = 0;
    		 left = min + i;
    		 for(int j = 1;j<left;j++) {
    			 if(left%j==0) {
    				 count++;
    			 }
    		 }
    		 if(count%2==0) {
    			 answer += left;
    		 }else answer += left*-1;
    	 }
    	 answer = -answer;
        return answer;
    }
}
