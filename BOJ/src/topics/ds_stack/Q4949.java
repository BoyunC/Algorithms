package topics.ds_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949 {
    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c == '(' || c == '[') {
                stack.push(c);
            } else if (c==')') {
                if(stack.empty() || stack.peek() != '(')
                    return "no";
                else
                    stack.pop();
            }
            else if(c==']') {
                if(stack.empty() || stack.peek() != '[')
                    return "no";
                else
                    stack.pop();
            }
        }

        if(stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;

        while (true){
            str = kb.readLine();

            if(str.equals("."))
                break;

            sb.append(solution(str)).append('\n');
        }

        System.out.println(sb);
    }
}
