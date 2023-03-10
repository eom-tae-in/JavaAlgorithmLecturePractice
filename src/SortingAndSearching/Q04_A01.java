package SortingAndSearching;
import java.util.Scanner;

public class Q04_A01 {

    public int[] solution(int[] array, int cacheRange) {
        int[] answer = new int[cacheRange];
        for (int x : array) {
            int pos = -1;
            for (int i = 0; i < cacheRange; i++) {
                if (x == answer[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int j = cacheRange - 1; j > 0; j--) {
                    answer[j] = answer[j - 1];
                }
            } else {
                for (int k = pos; k > 0; k--) {
                    answer[k] = answer[k - 1];
                }
            }
            answer[0] = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Q04_A01 q04_A01 = new Q04_A01();
        Scanner sc = new Scanner(System.in);
        int cacheRange = sc.nextInt();
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q04_A01.solution(array, cacheRange)) {
            System.out.print(i + " ");
        }
    }
}
