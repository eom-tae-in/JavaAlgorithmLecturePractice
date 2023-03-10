package SortingAndSearching;

import java.util.HashMap;
import java.util.Scanner;

public class Q05_A01 {

    public char solution(int[] array) {
        char answer = 'U';
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : array) {
            if (hashMap.containsKey(i)) {
                return 'D';
            }
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Q05_A01 q05_A01 = new Q05_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(q05_A01.solution(array));
    }
}
