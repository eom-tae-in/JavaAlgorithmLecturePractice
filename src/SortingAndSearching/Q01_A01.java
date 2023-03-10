package SortingAndSearching;

import java.util.Scanner;

public class Q01_A01 {

    public int[] solution(int[] array) {
        int index;
        for (int i = 0; i < array.length - 1; i++) {
            index = i;
            for (int j = i; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            if (index != i) {
                int tmp = array[i];
                array[i] = array[index];
                array[index] = tmp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Q01_A01 q01_A01 = new Q01_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q01_A01.solution(array)) {
            System.out.print(i + " ");
        }
    }
}
