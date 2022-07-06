package topics.ds_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10799 {

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String input = kb.readLine();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push('(');
                continue;
            }

            if (input.charAt(i) == ')') {
              stack.pop();

              if(input.charAt(i - 1) == '(') {
                  result += stack.size();
              } else {
                  result++;
              }
            }
        }

        System.out.println(result);
    }
}
