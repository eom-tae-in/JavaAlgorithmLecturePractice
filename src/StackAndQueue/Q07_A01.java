package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q07_A01 {

    public String solution(String order, String schedule) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char c : order.toCharArray()) {
            queue.offer(c);
        }
        for (char c : schedule.toCharArray()) {
            if (queue.contains(c)) {
                if (c != queue.poll()) {
                    return "NO";
                }
            }
        }
        if (!queue.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Q07_A01 q07_A01 = new Q07_A01();
        Scanner sc = new Scanner(System.in);
        String order = sc.next();
        String schedule = sc.next();
        System.out.println(q07_A01.solution(order,schedule));
    }
}
