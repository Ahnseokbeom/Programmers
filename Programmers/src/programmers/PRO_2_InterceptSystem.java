package programmers;

import java.util.Arrays;

class Node {
	int s,e;
	Node(int s, int e){
		this.s = s;
		this.e = e;
	}
}
public class PRO_2_InterceptSystem {
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}}));
	}
	public static int solution(int[][] targets) {
	    int answer = 1;
	    Arrays.sort(targets,(i1,i2)->{
	    	return i1[0] - i2[0];
	    });
	    Node node = new Node(0,targets[targets.length-1][1]);
	    for(int i = 0;i<targets.length;i++) {
	    	if((node.s <= targets[i][0])&&(targets[i][0] < node.e)) {
	    		node = new Node(targets[i][0],Math.min(node.e, targets[i][1]));
	    	}else {
	    		answer += 1;
	    		node = new Node(targets[i][0],targets[i][1]);
	    	}
	    }
	    return answer;
	}
}


