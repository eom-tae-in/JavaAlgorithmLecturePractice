package String;

import java.util.Scanner;

public class Q04_A01 {

    public String solution(String s) {
        char[] chars = s.toCharArray();
        int lt = 0;
        int rt = s.length() - 1;
        while (lt < rt) {
            char tem = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = tem;
            lt++;
            rt--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Q04_A01 q04_A01 = new Q04_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strings = new String[num];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.next();
        }
        for (String s : strings) {
            System.out.println(q04_A01.solution(s));
        }
    }
}
