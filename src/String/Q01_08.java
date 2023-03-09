package Q01;

import java.util.Scanner;

public class Q01_08 {

    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        // 정규식에서 ^은 !와 같음 -> [^A-Z] (A~Z가 아닌 것들은 다 ""(빈문자열)로 바꿔라)
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        if (str.equals(String.valueOf(sb))) {
            return "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Q01_08 q01_08 = new Q01_08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(q01_08.solution(str));
    }
}
