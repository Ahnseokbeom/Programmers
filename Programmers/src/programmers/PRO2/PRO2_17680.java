package programmers.PRO2;

import java.util.ArrayList;

public class PRO2_1차캐시 {
	public static void main(String[] args) {
		System.out.println(solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
		System.out.println(solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));

		System.out.println(solution(2, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco",
				"Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
		System.out.println(solution(5, new String[] {"Jeju", "Pangyo", "Seoul","NewYork","LA","SanFrancisco",
				"Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
		System.out.println(solution(5, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"}));
		System.out.println(solution(0, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
	}
	public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize==0) return cities.length*5;
        ArrayList<String> cache = new ArrayList<>();
        for(int i = 0;i<cities.length;i++){
            String s = cities[i].toUpperCase();
            if(cache.remove(s)){
                answer+=1;
                cache.add(s);
            }else{
                answer+=5;
                if(cache.size() >= cacheSize){
                    cache.remove(0);
                }
                cache.add(s);
            }
        }
        return answer;
    }
}
