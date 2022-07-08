package topics.ds_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> leftStack  = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        String str = kb.readLine();

        for (int i = 0; i < str.length(); i++) {
            leftStack.push(str.charAt(i));
        }

        int N = Integer.parseInt(kb.readLine());

        for (int i = 0; i < N; i++) {
            String cmd = kb.readLine();

            switch (cmd.charAt(0)) {
                case 'L' -> {
                    if (leftStack.empty()) {
                        break;
                    }
                    rightStack.push(leftStack.pop());
                }
                case 'D' -> {
                    if (rightStack.empty()) {
                        break;
                    }
                    leftStack.push(rightStack.pop());
                }
                case 'B' -> {
                    if (leftStack.empty()) {
                        break;
                    }
                    leftStack.pop();
                }
                case 'P' -> {
                    if (leftStack.empty()) {
                        break;
                    }
                    leftStack.push(cmd.charAt(2));
                }
            }
        }

        while (!leftStack.empty()){
            rightStack.push(leftStack.pop());
        }

        while (!rightStack.empty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }
}
