package programmers.PRO2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class PRO2_12981 {
	public static void main(String[] args) {
		String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(Arrays.toString(solution(3, words1)));
		
		String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		System.out.println(Arrays.toString(solution(5, words2)));
		
		String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
		System.out.println(Arrays.toString(solution(2, words3)));
	}
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Deque<String> q = new LinkedList<>();
        int count = 0;
		int minus = n-1;
        int[] numbers = new int[n];
		for(int j = 1;j<=n;j++) {
			numbers[j-1] = j;
		}
		ArrayList<Integer> arr =new ArrayList<>();
		while(arr.size()!=words.length) {
			for(int k = 1;k<=n;k++) {
				arr.add(k);
				if(arr.size()==words.length) break;
			}
		}
		int i = 0;
		for(;i<words.length;i++) {
			if(((i+minus)+1)%n==0) count++;
			if(!q.isEmpty() &&
               q.getLast().charAt(q.getLast().length()-1)!=words[i].charAt(0)) {
				break;
			}else if(!q.isEmpty() && q.contains(words[i])) {
				break;
			}else {
				q.addLast(words[i]);
			}
		}
        if(q.size()==words.length){
            answer[0] = answer[1] = 0;
        }else{
            answer[0] = arr.get(i);
            answer[1] = count;    
        }
        return answer;
    }
}
