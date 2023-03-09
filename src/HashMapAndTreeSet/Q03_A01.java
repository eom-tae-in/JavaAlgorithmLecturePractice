package HashMapAndTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q03_A01 {

    public ArrayList<Integer> solution(int[] array, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int lt = 0;
        for (int i = 0; i < k - 1; i++) {
            hashMap.put(array[i], hashMap.getOrDefault(array[i], 0) + 1);
        }
        for (int rt = k - 1; rt < array.length; rt++) {
            hashMap.put(array[rt], hashMap.getOrDefault(array[rt], 0) + 1);
            answer.add(hashMap.size());
            hashMap.put(array[lt], hashMap.get(array[lt]) - 1);
            if (hashMap.get(array[lt]) == 0) {
                hashMap.remove(array[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Q03_A01 q03_A01 = new Q03_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q03_A01.solution(array, k)) {
            System.out.print(i + " ");
        }
    }
}
