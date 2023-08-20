package programmers;

public class PRO_1_KeyPad {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
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
		System.out.println(answer);
	}

}
