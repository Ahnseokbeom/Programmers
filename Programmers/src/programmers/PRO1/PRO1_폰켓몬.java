package programmers.PRO1;

import java.util.HashSet;

public class PRO1_폰켓몬 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,1,2,3}));
		System.out.println(solution(new int[] {3,3,3,2,2,4}));
		System.out.println(solution(new int[] {3,3,3,2,2,2}));
	}
    public static int solution(int[] nums) {
        int size = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int answer = Math.min(size,set.size());
        return answer;
    }
}
