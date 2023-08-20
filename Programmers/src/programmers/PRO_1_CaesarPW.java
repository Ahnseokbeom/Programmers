package programmers;

public class PRO_1_CaesarPW {
	public static void main(String[] args) {
		String s = "a B z";
		String answer = "";
		int n = 4;
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c== ' ') {
				answer+=c;
			}
			if(c >='a' && c<='z') {
				if(c+n > 'z') {
					answer+= (char)(c-26+n);
				}else {
					answer+= (char)(c+n);
				}
			}else if(c >='A' && c<='Z'){
				if(c+n >'Z') {
					answer+= (char)(c-26+n);
				}else {
					answer+= (char)(c+n);
				}
			}
		}
		System.out.println(answer);
	}

}
