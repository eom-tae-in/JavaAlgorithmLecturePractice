package RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class Q01_A01 {

    public void solution(int n) {
        if (n > 1) {
            solution(n - 1);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Q01_A01 q01_A01 = new Q01_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        q01_A01.solution(num);
    }
}