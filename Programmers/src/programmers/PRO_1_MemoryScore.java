package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class PRO_1_MemoryScore {
	public static void main(String[] args) {
		String[] name1 = {"may","kein","kain","radi"};
		int[] year1 = {5,10,1,3};
		String[][] photo1 = {{"may", "kein", "kain", "radi"},
					{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
		System.out.println(Arrays.toString(solution(name1,year1,photo1)));
		String[] name2 = {"kali", "mari", "don"};
		int[] year2 = {11,1,55};
		String[][] photo2 = {{"kali", "mari", "don"},{"pony", "tom", "teddy"}
							,{"con", "mona", "don"}};
		System.out.println(Arrays.toString(solution(name2, year2, photo2)));

	}
	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0;i<name.length;i++) {
			map.put(name[i], yearning[i]);
		}

		for(int i = 0;i<photo.length;i++) {
			int cnt = 0;
			for(int j = 0;j<photo[i].length;j++) {
				if(map.containsKey(photo[i][j])) {
					cnt+=map.get(photo[i][j]);
				}
			}
			answer[i] = cnt;
		}

        return answer;
    }

}
