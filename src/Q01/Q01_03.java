import java.util.Scanner;

public class Q01_03 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] strings = str.split(" ");
        for (String x : strings) {
            if (x.length() > m) {
                m = x.length();
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args)  {
        Q01_03 q01_03 = new Q01_03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(q01_03.solution(str));
    }
}
