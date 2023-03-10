package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Q02_A01 {

    public String solution(String string) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(') {
                }
            } else {
                stack.push(c);
            }
        }
        for (Character character : stack) {
            answer += character;
        }
        return answer;
    }

    public static void main(String[] args) {
        Q02_A01 q02_A01 = new Q02_A01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q02_A01.solution(str));
    }
}
