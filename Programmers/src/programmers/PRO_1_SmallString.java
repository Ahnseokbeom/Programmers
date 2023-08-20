package programmers;

public class PRO_1_SmallString {
	public static void main(String[] args) {
//		String t = "3141592";
//		String p = "271";

		String t = "500220839878";
		String p = "7";

//		String t = "10203";
//		String p = "15";

		int len = p.length();
		long b = Long.parseLong(p);
		int answer = 0;
		for(int i = 0;i<t.length()-len+1;i++) {
			long a = Long.parseLong(t.substring(i, len+i));
			System.out.println("a : "+a);
			if(a <= b) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
