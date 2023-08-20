package programmers;

import java.util.HashSet;

public class PRO_1_PhoneKetmon {
	class Solution {
	    public int solution(int[] nums) {
	        int size = nums.length/2;
	        HashSet<Integer> set = new HashSet<>();
	        for(int i = 0;i<nums.length;i++){
	            set.add(nums[i]);
	        }
	        int answer = Math.min(size,set.size());
	        return answer;
	    }
	}

}
