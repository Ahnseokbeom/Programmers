package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PRO_3_DoublePriorityQueue {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(solution(new String[] { "I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1" })));

        System.out.println(Arrays.toString(
                solution(new String[] { "I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333" })));
    }

    public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> Minq = new PriorityQueue<>();
        PriorityQueue<Integer> Maxq = new PriorityQueue<>(Collections.reverseOrder());

        String[] str;

        for (int i = 0; i < operations.length; i++) {
            str = operations[i].split(" ");
            if (Minq.size() == 0 && str[0].equals("D"))
                continue;
            if (str[0].equals("I")) {
                Minq.add(Integer.parseInt(str[1]));
                Maxq.add(Integer.parseInt(str[1]));
            } else if (str[0].equals("D") && str[1].equals("1")) {
                Minq.remove(Maxq.poll());
            } else if (str[0].equals("D") && str[1].equals("-1")) {
                Maxq.remove(Minq.poll());
            }
        }
        if (Minq.size() > 0) {
            answer[0] = Maxq.poll();
            answer[1] = Minq.poll();
        }
        return answer;
    }
}
