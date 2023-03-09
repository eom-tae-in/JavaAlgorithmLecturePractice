package Array;

import java.util.Scanner;

public class Q04_A01 {

    public int[] solution(int number) {
        int[] fibonacci = new int[number];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < number; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        Q04_A01 q04_A01 = new Q04_A01();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i : q04_A01.solution(number)) {
            System.out.print(i + " ");
        }
    }
}
