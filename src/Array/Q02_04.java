package Q02;

import java.util.Scanner;

public class Q02_04 {

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
        Q02_04 q02_04 = new Q02_04();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i : q02_04.solution(number)) {
            System.out.print(i + " ");
        }
    }
}
