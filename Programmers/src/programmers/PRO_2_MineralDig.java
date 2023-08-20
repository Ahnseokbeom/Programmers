package programmers;

public class PRO_2_MineralDig {
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		int[] p1 = {1,3,2};
		String[] m1 = {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
		System.out.println(solution(p1, m1));
		min = Integer.MAX_VALUE;
		int[] p2 = {0,1,1};
		String[] m2 = {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};
		System.out.println(solution(p2, m2));
	}

    public static int solution(int[] picks, String[] minerals) {
        int D = picks[0];
        int I = picks[1];
        int S = picks[2];
        if (D > 0)
            dfs(0, "d", 0, minerals, D-1, I, S);
        if (I > 0)
            dfs(0, "i", 0, minerals, D, I-1, S);
        if (S > 0)
            dfs(0, "s", 0, minerals, D, I, S-1);

        return min;
    }
    public static void dfs(int cnt, String F, int idx, String[] minerals, int D, int I, int S) {
        if ( idx >= minerals.length ) {
            min = Math.min(min, cnt);
            return;
        }

        if (minerals[idx].equals("diamond")) {
            if ("d".equals(F)) {
                cnt += 1;
            } else if ("i".equals(F)) {
                cnt += 5;
            } else {
                cnt += 25;
            }
        } else if (minerals[idx].equals("iron")) {
            if ("d".equals(F)) {
                cnt += 1;
            } else if ("i".equals(F)) {
                cnt += 1;
            } else {
                cnt += 5;
            }
        } else if (minerals[idx].equals("stone")) {
            if ("d".equals(F)) {
                cnt += 1;
            } else if ("i".equals(F)) {
                cnt += 1;
            } else {
                cnt += 1;
            }
        }

        if ((idx + 1) % 5 == 0) {
            if ((D == 0 && I == 0 && S == 0) ) {
                min = Math.min(min, cnt);
                return;
            }

            if (D > 0) {
                dfs (cnt, "d", idx+1, minerals, D-1, I, S);
            }

            if (I > 0) {
                dfs(cnt, "i", idx+1, minerals, D, I-1, S);
            }

            if (S > 0) {
                dfs(cnt, "s", idx+1, minerals, D, I, S-1);
            }
        } else {
            dfs(cnt, F, idx+1, minerals, D, I, S);
        }
    }
}
