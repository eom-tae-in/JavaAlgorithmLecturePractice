package RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class Q02_A01 {

    public void solution(int num) {
        if (num > 0) {
            System.out.print(num % 2 + " ");
            solution(num / 2);
        }
    }

    public static void main(String[] args) {
        Q02_A01 q02_A01 = new Q02_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        q02_A01.solution(num);
    }
}
