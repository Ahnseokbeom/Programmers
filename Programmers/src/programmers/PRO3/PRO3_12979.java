package programmers.PRO3;

public class PRO3_12979 {
	public static void main(String[] args) {
		
		System.out.println(solution(11, new int[] {4,11},1));
		System.out.println(solution(16,new int[] {9},2));
	}
	public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int left = 1;
        for(int i = 0;i<stations.length;i++) {
        	if(left < stations[i]-w) answer+=search(left, stations[i]-w-1,w);
        	left = stations[i]+w+1;
        }
        if(stations[stations.length-1]+w<n)
        	answer += search(stations[stations.length-1]+w+1,n,w);
        return answer;
    }
	public static int search(int left, int right, int w) {
		int res = (right-left+1)/(2*w+1);
		if((right-left+1)%(2*w+1)>0) res++;
		return res;
	}

}
