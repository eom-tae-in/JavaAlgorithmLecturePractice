package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Q01_A01 {

    public char solution(String recStudent) {
        int max = -1;
        char answer = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : recStudent.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for (char k : hashMap.keySet()) {
            if (hashMap.get(k) > max) {
                max = hashMap.get(k);
                answer = k;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q01_A01 q01_A01 = new Q01_A01();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String recommendedStudent = sc.next().substring(0, number);
        System.out.println(q01_A01.solution(recommendedStudent));
    }
}