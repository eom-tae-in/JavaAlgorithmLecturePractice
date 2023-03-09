package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01_A01 {
    public ArrayList<Integer> solution(int[] array, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                list.add(array[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Q01_A01 q01_A01 = new Q01_A01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q01_A01.solution(array, n)) {
            System.out.print(i + " ");
        }
    }
}
