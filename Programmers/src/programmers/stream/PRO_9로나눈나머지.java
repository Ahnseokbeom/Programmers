package programmers.stream;

public class PRO_9로나눈나머지 {
	public static void main(String[] args) {
		System.out.println(solution("123"));
		System.out.println(solution("78720646226947352489"));
	}
	public static int solution(String number) {
        return number.chars()
        .map(Character::getNumericValue)
        .sum()%9;
    }
}
