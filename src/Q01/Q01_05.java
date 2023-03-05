import java.util.Scanner;

public class Q01_05 {

    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        int lt = 0, rt = s.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
                continue;
            }
            if (!Character.isAlphabetic(chars[rt])) {
                rt--;
                continue;
            }
            char tmp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = tmp;
            lt++;
            rt--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Q01_05 q01_05 = new Q01_05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q01_05.solution(str));
    }
}
