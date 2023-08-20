package programmers;

import java.util.ArrayList;

public class PRO_1_BlindMap{
	class Solution {
	    public String[] solution(int n, int[] arr1, int[] arr2) {
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
}
