package topics.ds_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q2493 {

    static class Top {
        int num;
        int height;

        Top(int num, int height) {
            this.num = num;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Top> stack = new Stack<>();
        int N = Integer.parseInt(kb.readLine());
        StringTokenizer st = new StringTokenizer(kb.readLine());

        for (int i = 1; i <= N; i++) {
            int height = Integer.parseInt(st.nextToken());

            if(stack.isEmpty()) {
                sb.append("0 ");
                stack.push(new Top(i, height));
            } else {
                while (true) {
                    if(stack.isEmpty()) {
                        sb.append("0 ");
                        stack.push(new Top(i, height));
                        break;
                    }

                    Top top = stack.peek();

                    if(top.height > height) {
                        sb.append(top.num + " ");
                        stack.push(new Top(i, height));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
