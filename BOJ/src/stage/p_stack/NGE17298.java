package stage.p_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class NGE17298 {

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(kb.readLine());
        int[] sequence = new int[n];

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");
        for(int i=0; i<n; i++)
            sequence[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            while (!stack.isEmpty() && sequence[stack.peek()] < sequence[i]) {
                sequence[stack.pop()] = sequence[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            sequence[stack.pop()] = -1;
        }

        for(int i=0; i<n; i++)
            sb.append(sequence[i]).append("\n");

        System.out.println(sb);
    }
}
