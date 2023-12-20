package programmers.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PRO_181885 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] {"problemsolving", "practiceguitar", "swim", "studygraph"}
		,new boolean[] {true, false, true, false})));
	}
	 public static String[] solution(String[] todo_list, boolean[] finished) {
	        return IntStream.range(0,finished.length)
	            .filter(i -> !finished[i])
	            .mapToObj(i -> todo_list[i])
	            .toArray(String[]::new);
	    }
}
