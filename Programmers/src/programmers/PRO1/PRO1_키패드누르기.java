package programmers.PRO1;

public class PRO1_키패드누르기 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
		System.out.println(solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
		System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
	}
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 12;
		int right = 10;
		for(int n : numbers) {
			if(n==1 || n==4 || n==7) {
				answer+="L";
				left = n;
			}else if(n==3 || n==6 || n==9) {
				answer+="R";
				right = n;
			}else {
				 if(n==0){
	                    n+=11;
	                }
	                int ld = (Math.abs(n-left))/3 + (Math.abs(n-left))%3;
	                int rd = (Math.abs(n-right))/3 + (Math.abs(n-right))%3;
	                if(ld==rd){
	                    if(hand.equals("right")){
	                        answer+="R";
	                        right = n;
	                    }else{
	                        answer+="L";
	                        left = n;
	                    }
	                }else if(ld>rd){
	                    answer+="R";
	                    right = n;
	                }else{
	                    answer+="L";
	                    left = n;
	                }
	            }
			}
        return answer;
    }
}
