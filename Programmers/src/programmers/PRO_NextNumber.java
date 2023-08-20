package programmers;

public class PRO_NextNumber {
	public static void main(String[] args) {
		int[] t1 = {1,2,3,4};
		System.out.println(solution(t1));

		int[] t2 = {2,4,8};
		System.out.println(solution(t2));
	}
	public static int solution(int[] common) {
		int answer = 0;
		int dif = 0;
		if((common[1]-common[0])==(common[2]-common[1])){
			dif = common[1] - common[0];
			answer = common[common.length-1]+dif;
		}else if((common[1]/common[0])==(common[2]/common[1])) {
			dif = common[1] / common[0];
			answer = common[common.length-1]*dif;
		}
		return answer;
	}
}
