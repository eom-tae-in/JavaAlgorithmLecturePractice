package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q06_A01 {

    public ArrayList<Integer> solution(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            int num = flipNumber(i);
            if (isPrime(num)) {
                list.add(num);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Q06_A01 q06_A01 = new Q06_A01();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q06_A01.solution(array)) {
            System.out.print(i + " ");
        }
    }

    public int flipNumber(int number) {
        int tmp = number;
        int res = 0;
        while (tmp > 0) {
            int t = tmp % 10;
            res = res * 10 + t;
            tmp /= 10;
        }
        return res;
    }

    public boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
