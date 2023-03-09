package Two_PointersAndSliding_Window;

import java.util.Scanner;

public class Q03_A01 {
    public int solution(int[] days, int number) {
        int answer, sum = 0;
        for (int i = 0; i < number; i++) {
            sum += days[i];
        }
        answer = sum;
        for (int i = number; i < days.length; i++) {
            sum += days[i] - days[i - number];
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Q03_A01 q03_A01 = new Q03_A01();
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int number = sc.nextInt();
        int[] days = new int[day];
        for (int i = 0; i < day; i++) {
            days[i] = sc.nextInt();
        }
        System.out.println(q03_A01.solution(days, number));
    }
}
