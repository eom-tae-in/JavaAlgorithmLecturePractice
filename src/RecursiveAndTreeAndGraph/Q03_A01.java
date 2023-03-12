package RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class Q03_A01 {

    public int solution(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * solution(num - 1);
        }
    }

    public static void main(String[] args) {
        Q03_A01 q03_A01 = new Q03_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(q03_A01.solution(num));
    }
}
