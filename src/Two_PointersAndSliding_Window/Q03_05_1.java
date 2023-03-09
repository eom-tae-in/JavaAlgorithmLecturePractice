package Q03;

import java.util.Scanner;

public class Q03_05_1 {

    public int solution(int num) {
        int answer = 0, sum = 0, lt = 0;
        int[] array = new int[num/2 + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int rt = 0; rt < array.length; rt++) {
            sum += array[rt];
            if (sum == num) {
                answer++;
            }
            while (sum >= num) {
                sum -= array[lt++];
                if (sum == num) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q03_05_1 q03_05 = new Q03_05_1();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(q03_05.solution(num));
    }
}
