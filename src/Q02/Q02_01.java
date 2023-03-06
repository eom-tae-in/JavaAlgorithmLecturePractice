package Q02;

import java.util.ArrayList;
import java.util.Scanner;

public class Q02_01 {
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
        Q02_01 q02_01 = new Q02_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q02_01.solution(array, n)) {
            System.out.print(i + " ");
        }
    }
}
