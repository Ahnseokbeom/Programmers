package programmers;

public class PRO_1_FoodFighter {
	public static String solution(int[] food) {
		String answer = "";
		String left = "";
		String right = "";

		for(int i = 1;i<food.length;i++) {
			if(food[i]!=0) {
				for(int j = 0;j<(food[i]/2);j++) {
					left +=Integer.toString(i);
					right += Integer.toString(i);
				}
			}
		}
		answer = left+"0";
		for(int i = right.length()-1;i>=0;i--) {
			answer+=right.substring(i,i+1);
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] food1 = {1,3,4,6};
		int[] food2 = {1,7,1,2};
		System.out.println(solution(food1));
		System.out.println(solution(food2));
	}

}
