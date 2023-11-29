package programmers.PRO1;

import java.util.Arrays;
import java.util.List;

public class PRO1_PCCE_데이터분석 {
	public static void main(String[] args) {
		int[][] data = {{1, 20300104, 100, 80},{2, 20300804, 847, 37},{3, 20300401, 10, 8}};
		System.out.println(solution(data, "date", 20300501, "remain"));
	}
	 public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

	        String[] arr = {"code","date","maximum","remain"};
	        List<String> columnList = Arrays.asList(arr);
	        int extIdx = columnList.indexOf(ext);
	        int sortIdx = columnList.indexOf(sort_by);
	        int[][] answer = Arrays.stream(data).filter(o1 -> o1[extIdx] < val_ext)
	            .sorted((o1 ,o2) -> o1[sortIdx]-o2[sortIdx]).toArray(int[][]::new);

	        return answer;
	    }
}
