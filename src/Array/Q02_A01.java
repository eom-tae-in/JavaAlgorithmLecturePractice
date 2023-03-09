package Array;

import java.util.Scanner;

public class Q02_A01 {

    public int solution(int[] students) {
        int answer = 1;
        int maxValue = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i] > maxValue) {
                answer++;
                maxValue = students[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q02_A01 q02_A01 = new Q02_A01();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] students = new int[number];
        for (int i = 0; i < students.length; i++) {
            students[i] = sc.nextInt();
        }
        System.out.println(q02_A01.solution(students));
    }
}
