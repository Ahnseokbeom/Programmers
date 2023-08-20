package programmers;

public class PRO_1_MoneyResult {
	public static void main(String[] args) {
		long answer = 0;
		int price = 3;
		int money = 40;
		int count = 4;
		long sum = 0;
		for(int i = 1;i<=count;i++) {
			sum+=price*i;
		}

		answer = sum>money?sum-money:0;
		System.out.println(answer);
	}

}
