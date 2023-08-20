package programmers;

public class PRO_2_NumberCardDivide {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {10,17}, new int[] {5,20}));
		System.out.println(solution(new int[] {10,20}, new int[] {5,17}));
		System.out.println(solution(new int[] {14,35,119},new int[] {18,30,102}));
	}
	public static int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        if(arrayA.length==1) {
        	if(arrayA[0]==arrayB[0]) return 0;
        	else return Math.max(arrayA[0],arrayB[0]);
        }else {
        	int n1 = 0;
        	int n2 = 0;
        	int Agcd = 0;
        	int Bgcd = 0;
        	for(int i = 0;i<arrayA.length;i++) {
        		Agcd = gcd(Agcd,arrayA[i]);
        		Bgcd = gcd(Bgcd,arrayB[i]);
        	}
        	System.out.println(Agcd+" "+Bgcd);
        	if(Agcd != 1 && divide(arrayB, Agcd)) n1 = Agcd;
    		if(Bgcd != 1 && divide(arrayA, Bgcd)) n2 = Bgcd;
    		System.out.println(n1+" "+n2);
    		answer = Math.max(n1, n2);
        }
        return answer;
    }
	public static int gcd(int a, int b) {
			while(b!=0) {
				int c = a%b;
				a = b;
				b = c;
			}
			return a;
	}
	public static boolean divide(int[] arr, int a) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%a==0) return false;
		}
		return true;
	}
}
