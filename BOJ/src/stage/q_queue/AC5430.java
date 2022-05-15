package stage.q_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class AC5430 {

    static BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void AC(String cmd, ArrayDeque<Integer> deque) {
        boolean isRight = true;

        for (int i = 0; i < cmd.length(); i++) {
            if(cmd.charAt(i) == 'R') {
                isRight = !isRight;
                continue;
            }

            if(isRight) {
                if(deque.pollFirst() == null) {
                    sb.append("error").append('\n');
                    return;
                }
            } else {
                if(deque.pollLast() == null) {
                    sb.append("error").append('\n');
                    return;
                }
            }
        }

        sb.append('[');

        if(deque.size() > 0) {
            if(isRight) {
                sb.append(deque.pollFirst());

                while(!deque.isEmpty()){
                    sb.append(',').append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());

                while(!deque.isEmpty()){
                    sb.append(',').append(deque.pollLast());
                }
            }
        }

        sb.append(']').append('\n');
    }

    public static void main(String[] args) throws IOException {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int t = Integer.parseInt(kb.readLine());

        while (t --> 0) {
            String cmd = kb.readLine();

            int n = Integer.parseInt(kb.readLine());
            StringTokenizer st = new StringTokenizer(kb.readLine(), "[],");

            for (int i = 0; i < n; i++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            AC(cmd, deque);
        }

        System.out.println(sb);
    }
}
