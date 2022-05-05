package stage.p_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(kb.readLine());
        int start = 0;

        while (n-->0){
            int num = Integer.parseInt(kb.readLine());

            if(num > start) {
                 for(int i=start+1; i<=num; i++) {
                     stack.push(i);
                     sb.append('+').append('\n');
                 }
                 start = num;
            } else if(stack.peek()!=num){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}
