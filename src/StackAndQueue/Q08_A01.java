package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q08_A01 {

    class Patient {
        int id;
        int priority;
        public Patient(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int[] patients, int m) {
        int answer = 0;
        Queue<Patient> queue = new LinkedList<>();
        for (int i = 0; i < patients.length; i++) {
            queue.add(new Patient(i, patients[i]));
        }
        while (!queue.isEmpty()) {
            Patient p = queue.poll();
            for (Patient patient : queue) {
                if (p.priority < patient.priority) {
                    queue.add(p);
                    p = null;
                    break;
                }
            }
            if (p != null) {
                answer++;
                if (p.id == m) {
                    return answer;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Q08_A01 q08_A01 = new Q08_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        int[] patients = new int[num];
        for (int i = 0; i < num; i++) {
            patients[i] = sc.nextInt();
        }
        System.out.println(q08_A01.solution(patients, m));
    }
}
