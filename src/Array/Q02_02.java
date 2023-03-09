package Q02;

import java.util.Scanner;

public class Q02_02 {

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
        Q02_02 q02_02 = new Q02_02();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] students = new int[number];
        for (int i = 0; i < students.length; i++) {
            students[i] = sc.nextInt();
        }
        System.out.println(q02_02.solution(students));
    }
}
