package programmers.PRO2;

public class PRO2_148653 {
	public static void main(String[] args) {
		System.out.println(solution(16));
		System.out.println(solution(2554));
		System.out.println(solution(100000000));
	}
	public static int solution(int storey) {
        int answer = 0;
        while (storey != 0) {
            int num = storey % 10;

            if (num > 5) {
                answer += (10 - num);
                storey += 10;
            } else if (num < 5) {
                answer += num;
            } else {
                if ((storey / 10) % 10 > 4) {
                    storey += 10;
                }
                answer += num;
            }

            storey /= 10;
        }

        return answer;
    }
}
