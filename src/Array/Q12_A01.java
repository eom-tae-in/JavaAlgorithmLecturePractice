package Array;

import java.util.*;

public class Q12_A01 {

    public int solution(int[][] arrays, int students, int tests) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < students; i++) {
            list.clear();
            int studentNumber = i + 1;
            for (int j = 0; j < tests; j++) {
                int index = students;
                for (int k = 0; k < students; k++) {
                    if (arrays[j][k] == studentNumber) {
                        index = k;
                    }
                    if (index < k) {
                        list.add(arrays[j][k]);
                    }
                }
                if (index == students) {
                    list.clear();
                }
            }
            answer += list.stream().distinct()
                    .filter(integer -> Collections.frequency(list, integer) == tests)
                    .count();
        }
        return answer;
    }

    public static void main(String[] args) {
        Q12_A01 q12_A01 = new Q12_A01();
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int tests = sc.nextInt();
        int[][] arrays = new int[tests][students];
        for (int i = 0; i < tests; i++) {
            for (int j = 0; j < students; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }
        System.out.println(q12_A01.solution(arrays, students, tests));
    }
}
