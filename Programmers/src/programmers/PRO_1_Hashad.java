package programmers;

public class PRO_1_Hashad {
	class Solution {
	    public boolean solution(int x) {
	        boolean answer = true;
	        return answer;
	    }
	}
	public static void main(String[] args) {
		boolean a = true;
		int x = 9994;
		int sum = 0;
		String s = Integer.toString(x);
		for(int i = 0;i<s.length();i++) {
			sum+=Integer.parseInt(s.charAt(i)+"");
		}
		System.out.println(sum);
	}

}
