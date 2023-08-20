package programmers;

public class PRO_1_Paint {
	public static void main(String[] args) {
		int n1 = 8;
		int m1 = 4;
		int[] section1 = {2,3,6};
		System.out.println(solution(n1,m1,section1));

		int n2 = 5;
		int m2 = 4;
		int[] section2 = {1,3};
		System.out.println(solution(n2,m2,section2));

		int n3 = 4;
		int m3 = 1;
		int[] section3 = {1,2,3,4};
		System.out.println(solution(n3,m3,section3));
	}
	public static int solution(int n, int m, int[] section) {
		int answer = 0;
		int num = section[0];
		int idx = 0;
		while(idx < section.length) {
			if(num <= section[idx]) {
				num = section[idx] + m;
				answer++;
			}
			idx++;
		}

		return answer;
	}

}
