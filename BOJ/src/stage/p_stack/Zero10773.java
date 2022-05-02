package stage.p_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int k = Integer.parseInt(kb.readLine());

        for(int i=0; i<k; i++) {
            int num = Integer.parseInt(kb.readLine());

            if(num==0)
                stack.pop();
            else
                stack.add(num);
        }

        int sum = 0;

        for(int x : stack)
            sum += x;

        System.out.println(sum);
    }
}
