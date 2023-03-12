package RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class Q04_A01 {
    public int solution(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return solution(num - 1) + solution(num - 2);
        }
    }

    public static void main(String[] args) {
        Q04_A01 q04_A01 = new Q04_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(q04_A01.solution(i) + " ");
        }
    }
}
