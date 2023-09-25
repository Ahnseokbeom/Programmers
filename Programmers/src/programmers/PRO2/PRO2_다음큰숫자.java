package programmers.PRO2;

public class PRO2_다음큰숫자 {
	public static void main(String[] args) {
		
		System.out.println(solution(78));
		System.out.println(solution(15));
	}
	public static int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n);
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)=='1') count++;
		}
		for(int i = n+1;i<1000000;i++) {
			String temp = Integer.toBinaryString(i);
			int tempC = 0;
			for(int j = 0;j<temp.length();j++) {
				if(temp.charAt(j)=='1') tempC++;
			}
			if(tempC==count) {
				answer = i;
				break;
			}
		}
        return answer;
    }
}
