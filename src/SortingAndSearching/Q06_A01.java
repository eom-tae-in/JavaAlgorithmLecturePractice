package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q06_A01 {

    public ArrayList<Integer> solution (int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] clone = array.clone();
        Arrays.sort(clone);
        for (int i = 0; i < array.length; i++) {
            if (clone[i] != array[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q06_A01 q06_A01 = new Q06_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q06_A01.solution(array)) {
            System.out.print(i + " ");
        }
    }
}
