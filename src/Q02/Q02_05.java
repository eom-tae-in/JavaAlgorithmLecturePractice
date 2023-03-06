package Q02;

import java.util.Scanner;

public class Q02_05 {

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
        Q02_05 q02_05 = new Q02_05();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(q02_05.eratosthenes(number));
    }
}
