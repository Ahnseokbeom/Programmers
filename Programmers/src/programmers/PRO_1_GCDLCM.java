package programmers;

public class PRO_1_GCDLCM {
	public static void main(String[] args) {
		System.out.println(GCD(3,12)+" "+LCM(3,12));
		System.out.println(GCD(2,5)+" "+LCM(2,5));
	}
	public static int GCD(int a, int b) {
		while(a!=0) {
			int n = b%a;
			b = a;
			a = n;
		}
		return b;
	}
	public static int LCM(int a, int b) {
		int n = GCD(a,b);
		if(n==1) {
			return a*b;
		}
		return GCD(a,b)*b/a;
	}
}
