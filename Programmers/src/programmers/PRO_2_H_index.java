package programmers;

public class PRO_2_H_index {
	public static void main(String[] args) {
		int[] citations = {0,0,2,1,1};
		int result = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<citations.length;i++){
            if(max<citations[i]) max = citations[i];
        }
        for(int i = 1;i<=max;i++){
            int answer = 0;
            for(int j = 0;j<citations.length;j++){
                if(i<=citations[j]) answer++;
            }
            if(answer==i) result = i;
        }
        System.out.println(result);
	}

}
