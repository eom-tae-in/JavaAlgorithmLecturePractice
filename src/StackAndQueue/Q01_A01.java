package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Q01_A01 {
    public String solution(String string) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Q01_A01 q01_A01 = new Q01_A01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q01_A01.solution(str));
    }
}
