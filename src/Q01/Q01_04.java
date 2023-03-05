package Q01;

import java.util.Scanner;

public class Q01_04 {

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
        Q01_04 q01_04 = new Q01_04();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strings = new String[num];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.next();
        }
        for (String s : strings) {
            System.out.println(q01_04.solution(s));
        }
    }
}
