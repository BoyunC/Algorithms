package stage.p_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(kb.readLine());
        int[] stack = new int[n];

        int size = 0;

        while(n-->0) {
            StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    stack[size] = Integer.parseInt(st.nextToken());
                    size++;
                    break;
                case "pop" :
                    if(size==0)
                        sb.append(-1);
                    else {
                        int result = stack[size-1];
                        stack[size-1] = 0;
                        sb.append(result);
                        size--;
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(size).append("\n");
                    break;
                case "empty":
                    if(size==0)
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "top":
                    if(size==0)
                        sb.append(-1).append("\n");
                    else
                        sb.append(stack[size-1]).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
