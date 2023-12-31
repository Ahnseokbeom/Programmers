package programmers.PRO1;

import java.util.ArrayList;
import java.util.Arrays;

//1 - 6개 일치 / 2 - 5개 일치 / 3 - 4개 일치 / 4 - 3개 일치 / 5 - 2개 일치 / 6 그 외
public class PRO1_77484 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19})));
		System.out.println(Arrays.toString(solution(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25})));
		System.out.println(Arrays.toString(solution(new int[] {45, 4, 35, 20, 3, 9}, new int[] {20, 9, 3, 45, 4, 35})));
	}
    public static int[] solution(int[] lottos, int[] win_nums) {
    	int[] answer = {};
    	int zero = 0; // 0의 개수
    	int count = 0; // 맞은 개수
    	int[] arr = {6,6,5,4,3,2,1};
    	Arrays.sort(lottos); // 오름차순 정렬
    	Arrays.sort(win_nums); // 오름차순 정렬

    	for(int i = 0;i<lottos.length;i++) { // 알아볼 수 없는 번호
    		if(lottos[i]==0) {
    			zero++;
    			continue;
    		}
    		for(int j = 0;j<win_nums.length;j++) { // 내 로또번호와 당첨번호가 동일하면 1 증가
    			if(lottos[i]==win_nums[j]) {
    				count++;
    				break;
    			}
    		}
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(arr[zero+count]);
    	list.add(arr[count]);
    	answer = new int[list.size()];
    	for(int i = 0;i<answer.length;i++) {
    		answer[i] = list.get(i);
    	}
	    	return answer;
    	}
}

