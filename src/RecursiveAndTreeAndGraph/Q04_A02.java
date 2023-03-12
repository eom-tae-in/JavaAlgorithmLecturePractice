package RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class Q04_A02 {

    static int[] fibonacci;

    public int solution(int num) {
        if (fibonacci[num] != 0) {
            return fibonacci[num];
        }
        if (num == 1 || num == 2) {
            return fibonacci[num] = 1;
        } else {
            return fibonacci[num] = solution(num - 1) + solution(num - 2);
        }
    }

    public static void main(String[] args) {
        Q04_A02 q04_A02 = new Q04_A02();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fibonacci = new int[num + 1];
        q04_A02.solution(num);
        for (int i = 1; i <= num; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
