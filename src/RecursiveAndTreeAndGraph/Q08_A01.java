package RecursiveAndTreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q08_A01 {
    int[] distance = {1, -1, 5};
    int[] ch = new int[10001];
    Queue<Integer> queue = new LinkedList<>();
    public int solution(int pLocation, int cLocation) {
        ch[pLocation] = 1;
        queue.add(pLocation);
        int answer = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int cd = queue.poll();
                for (int j = 0; j < distance.length; j++) {
                    int pos = cd + distance[j];
                    if (pos == cLocation) {
                        return answer + 1;
                    }
                    if (pos >= 1 && pos <= 10000 && ch[pos] == 0) {
                        ch[pos] = 1;
                        queue.add(pos);
                    }
                }
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Q08_A01 q08_A01 = new Q08_A01();
        Scanner sc = new Scanner(System.in);
        int pLocation = sc.nextInt();
        int cLocation = sc.nextInt();
        System.out.println(q08_A01.solution(pLocation,cLocation));
    }
}
