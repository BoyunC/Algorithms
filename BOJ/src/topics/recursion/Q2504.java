package topics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q2504 {

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String N = kb.readLine();
        int result = 0;
        int value = 1;

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '(') {
                stack.push(N.charAt(i));
                value *= 2;
            } else if (N.charAt(i) == '[') {
                stack.push(N.charAt(i));
                value *= 3;
            } else if (N.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    result = 0;
                    break;
                } else if (N.charAt(i - 1) == '(') {
                    result += value;
                }

                stack.pop();
                value /= 2;
            } else if (N.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    result = 0;
                    break;
                } else if (N.charAt(i - 1) == '[') {
                    result += value;
                }

                stack.pop();
                value /= 3;
            }
        }

        sb.append(result).append("\n");
        System.out.println(sb);
    }
}
