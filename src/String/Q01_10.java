package Q01;

import java.util.Scanner;

public class Q01_10 {

    final static int MAX_INDEX_LENGTH = 100;

    public int[] solution(String str, char ch) {
        int[] answer = new int[str.length()];
        int maxIndexLength = MAX_INDEX_LENGTH;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                maxIndexLength = 0;
                answer[i] = maxIndexLength;
                continue;
            }
            maxIndexLength++;
            answer[i] = maxIndexLength;
        }
        maxIndexLength = MAX_INDEX_LENGTH;
        for (int i = str.length() - 1; i > -1; i--) {
            if (str.charAt(i) == ch) {
                maxIndexLength = 0;
                continue;
            }
            maxIndexLength++;
            answer[i] = Math.min(answer[i], maxIndexLength);
        }
        return answer;
    }

    public static void main(String[] args) {
        Q01_10 q01_10 = new Q01_10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);

        for (int i : q01_10.solution(str, ch)) {
            System.out.print(i + " ");
        }
    }
}
