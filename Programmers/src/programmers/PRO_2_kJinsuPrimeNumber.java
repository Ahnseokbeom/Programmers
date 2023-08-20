package programmers;

public class PRO_2_kJinsuPrimeNumber {
	public static void main(String[] args) {
		int n1 = 437674;
		int k1 = 3;

		System.out.println(solution(n1,k1));

		int n2 = 110011;
		int k2 = 10;
		System.out.println(solution(n2,k2));
	}
	public static int solution(int n, int k) {
	    int answer = 0, i, j;
        String s = Knum(n,k);
        for(i = 0; i < s.length(); i = j) {
            for(j = i + 1; j < s.length() && s.charAt(j) != '0'; j++);
            if(isprime(Long.parseLong(s.substring(i,j))))
                answer++;
        }
        return answer;
    }
	public static boolean isprime(long n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }
	 public static String Knum(int n, int k) {
	        String res = "";
	        while(n > 0) {
	            res = n % k + res;
	            n /= k;
	        }
	        return res;
    }

}
