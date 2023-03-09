package HashMapAndTreeSet;

import java.util.*;

public class Q05_A01 {
    public int solution(int[] array, int k) {
        int answer = -1, count = 0;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for (int lt = 0; lt < array.length - 2; lt++) {
            for (int mt = lt + 1; mt < array.length - 1; mt++) {
                for (int rt = mt + 1; rt < array.length; rt++) {
                    treeSet.add(array[lt] + array[mt] + array[rt]);
                }
            }
        }
        for (int i : treeSet) {
            count++;
            if (count == k) {
                return i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q05_A01 q05_A01 = new Q05_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(q05_A01.solution(array, k));
    }
}
