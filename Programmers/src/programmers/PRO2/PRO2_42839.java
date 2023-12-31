package programmers.PRO2;

import java.util.ArrayList;

public class PRO2_42839 {
	static int answer = 0;
    static boolean[] check = new boolean[7];
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
		System.out.println(solution("17"));
		System.out.println(solution("011"));
	}
    public static int solution(String numbers) {
        String comb="";

        for(int i = 1;i<=numbers.length();i++) dic(numbers,comb,i);

        for(int x : arr) dec(x);

        return answer;
    }
    public static void dic(String n,String comb,int len){
        if(comb.length() == len) {
            if(!arr.contains(Integer.parseInt(comb))) arr.add(Integer.parseInt(comb));
            return;
        }

        for(int j =0;j<n.length();j++){
            if(check[j]) continue;
            comb += n.charAt(j);
            check[j] = true;
            dic(n,comb,len);
            check[j] = false;
            comb = comb.substring(0,comb.length()-1);

        }
    }

    public static void dec(int n){
        if(n == 0) return;
        if(n == 1) return;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return;
        }
        answer++;
    }
}
