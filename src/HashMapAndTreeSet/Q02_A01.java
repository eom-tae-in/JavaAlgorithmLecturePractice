package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Q02_A01 {

    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c1 : str1.toCharArray()) {
            map.put(c1, map.getOrDefault(c1, 0) + 1);
        }
        for (char c2 : str2.toCharArray()) {
            if (!map.containsKey(c2) || map.get(c2) == 0) {
                return "NO";
            }
            map.put(c2, map.get(c2) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Q02_A01 q02_A01 = new Q02_A01();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(q02_A01.solution(str1, str2));
    }
}