package programmers.PRO2;

public class PRO2_12952 {
	static boolean[] visited;
    static int[] pick;
    static int answer;
    public static void main(String[] args) {
		System.out.println(solution(4));
	}
    public static int solution(int n) {
        visited = new boolean[n];
        pick = new int[n];
        answer = 0;

        permutation(n, 0);
        return answer;
        }
    public static void permutation(int n, int idx) {
        if(n == idx) {
            answer++;
            return;
        }

        for(int i = 0; i < n; i++) {
            if(visited[i] == false) {
                visited[i] = true;
                pick[idx] = i;
                if(check(idx)) permutation(n, idx + 1);
                visited[i] = false;
            }
        }
    }

    public static boolean check(int idx) {
        for(int i = 0; i < idx; i++) {
            if(pick[i] == pick[idx]) return false;
            if(Math.abs(idx - i) == Math.abs(pick[idx] - pick[i])) return false;
        }
        return true;
    }

}
