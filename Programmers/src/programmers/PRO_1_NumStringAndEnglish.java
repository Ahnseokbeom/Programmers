package programmers;

public class PRO_1_NumStringAndEnglish {
	public static void main(String[] args) {
		String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] index = {"0","1","2","3","4","5","6","7","8","9"};
		String s = "one4seveneight";
		for(int i = 0;i<num.length;i++) {
			s = s.replace(num[i], index[i]);
		}
		System.out.println(s);
	}

}
