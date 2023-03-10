package SortingAndSearching;

import java.util.Scanner;

public class Q02_A01 {

    public int[] solution(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j +1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Q02_A01 q02_A01 = new Q02_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q02_A01.solution(array)) {
            System.out.print(i + " ");
        }
    }
}