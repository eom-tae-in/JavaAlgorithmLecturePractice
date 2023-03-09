package Array;

import java.util.Scanner;

public class Q05_A01 {

    public int eratosthenes(int number) {
        int answer = 0;
        int[] array = new int[number + 1];
        for (int i = 2; i <= number; i++) {
            if (array[i] == 0) {
                answer++;
            }
            for (int j = i; j <= number; j += i) {
                array[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q05_A01 q05_A01 = new Q05_A01();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(q05_A01.eratosthenes(number));
    }
}
