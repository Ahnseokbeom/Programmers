package programmers;

public class PRO_3_BaseStatinInstall {
	public static void main(String[] args) {
		int n1 = 11;
		int[] stations1 = {4,11};
		int w1 = 1;
		System.out.println(solution(n1,stations1,w1));

		int n2 = 16;
		int[] stations2 = {9};
		int w2 = 2;
		System.out.println(solution(n2,stations2,w2));
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
