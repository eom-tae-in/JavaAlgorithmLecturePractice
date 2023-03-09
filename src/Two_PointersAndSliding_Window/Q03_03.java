package Q03;

import java.util.Scanner;

public class Q03_03 {
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
        Q03_03 q03_03 = new Q03_03();
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int number = sc.nextInt();
        int[] days = new int[day];
        for (int i = 0; i < day; i++) {
            days[i] = sc.nextInt();
        }
        System.out.println(q03_03.solution(days, number));
    }
}
