package programmers.PRO1;

public class PRO1_내적 {
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {1,2,3,4}, new int[] {-3,-1,0,2}));
		System.out.println(solution(new int[] {-1,0,1}, new int[] {1,0,-1}));
	}
    public static int solution(int[] a, int[] b) {
    	int result = 0;
    	for(int i = 0;i<a.length;i++) {
    		result +=a[i]*b[i];
    	}
        int answer = result;
        return answer;
    }
}
