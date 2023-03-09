package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Q04_A01 {

    public int solution(String str, String partStr) {
        int answer = 0, lt =0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : partStr.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < partStr.length() - 1; i++) {
            map2.put(str.charAt(i), map2.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int rt = partStr.length() - 1; rt < str.length(); rt++) {
            map2.put(str.charAt(rt), map2.getOrDefault(str.charAt(rt), 0) + 1);
            if (map1.equals(map2)) {
                answer++;
            }
            map2.put(str.charAt(lt), map2.get(str.charAt(lt)) - 1);
            if (map2.get(str.charAt(lt)) == 0) {
                map2.remove(str.charAt(lt));
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Q04_A01 q04_A01 = new Q04_A01();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String partStr = sc.next();
        System.out.println(q04_A01.solution(str, partStr));
    }
}
