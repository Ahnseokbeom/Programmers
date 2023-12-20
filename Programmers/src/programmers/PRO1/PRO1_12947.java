package programmers.PRO1;

public class PRO1_12947 {
	public static void main(String[] args) {
		
		System.out.println(solution(10));
		System.out.println(solution(11));
		System.out.println(solution(12));
		System.out.println(solution(13));
	}
	public static boolean solution(int x) {
        boolean answer = true;
        String s = Integer.toString(x);
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            sum+= Integer.parseInt(s.charAt(i)+"");
        }
        if(x%sum==0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
