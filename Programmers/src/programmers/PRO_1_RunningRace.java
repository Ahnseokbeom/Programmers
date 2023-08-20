package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class PRO_1_RunningRace {
	static String[] players = { "mumu", "soe", "poe", "kai", "mine" };
	static String[] callings = { "kai", "kai", "mine", "mine" };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(players, callings)));
	}

	public static String[] solution(String[] players, String[] callings) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}
		for (String s : callings) {
			int temp = map.get(s);
			map.put(s, temp - 1);
			map.put(players[temp - 1], temp);
			players[temp] = players[temp - 1];
			players[temp - 1] = s;
		}
		return players;
	}
}
