package programmers.PRO3;

public class PRO3_단어변환 {
	static boolean visit[];
	static int answer = 999999;
	public static void main(String[] args) {
		
		System.out.println(solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"}));
		System.out.println(solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log"}));
	}

	public static int solution(String begin, String target, String[] words) {
		for(int i = 0;i<words.length;i++) {
			if(compare(begin, words[i]) <= 1) {
				visit = new boolean[words.length];
				visit[i] = true;
				dfs(1,i,target,words);
			}
		}
		return answer == 999999 ? 0:answer;
	}

	static void dfs(int count, int cur, String target, String[] words) {
		if(target.equals(words[cur])) {
			answer = Math.min(count, answer);
			return;
		}
		for(int i = 0;i<words.length;i++) {
			if(!visit[i] && compare(words[cur],words[i])==1) {
				visit[i] = true;
				dfs(count+1,i,target,words);
				visit[i] = false;
			}
		}
	}

	static int compare(String s1, String s2) {
		int n = 0;
		for(int i = 0;i<s1.length();i++) {
			if(s1.charAt(i) != s2.charAt(i))n++;
		}
		return n;
	}

}
