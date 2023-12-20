package programmers.PRO1;

public class PRO1_76501 {
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {4,7,2}, new boolean[] {true,false,true}));
		System.out.println(solution(new int[] {1,2,3}, new boolean[] {false,false,true}));
	}
    public static int solution(int[] absolutes, boolean[] signs) {
    	int sum = 0;
    	for(int i = 0;i<absolutes.length;i++) {
    		if(signs[i]==true) {
    			sum+=absolutes[i]*1;
    		}else {
    			sum+=absolutes[i]*-1;
    		}
    	}
        int answer = sum;
        return answer;
    }
}
