package programmers.PRO1;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO1_1차비밀지도{
	public static void main(String[] args) {
	System.out.println(Arrays.toString(solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28})));

	System.out.println(Arrays.toString(solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10})));
	}
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i<arr1.length;i++){
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            while(s1.length()!=n) s1 = "0"+s1;
            while(s2.length()!=n) s2 = "0"+s2;
            String result = "";
            for(int j = 0;j<s1.length();j++){
                if(s1.charAt(j)=='1' || s2.charAt(j)=='1'){
                    result += '1';
                }else result += " ";
            }
            list.add(result.replaceAll("1","#"));
        }
        for(int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
