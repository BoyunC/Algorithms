package stage.q_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Deque10866 {

    public static void main(String[] args) throws IOException  {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(kb.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = kb.readLine().split(" ");

            if(str[0].equals("push_front")) {

                deque.addFirst(Integer.parseInt(str[1]));

            } else if (str[0].equals("push_back")) {

                deque.addLast(Integer.parseInt(str[1]));

            } else if (str[0].equals("pop_front")) {

                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.pollFirst()).append("\n");
                }

            } else if (str[0].equals("pop_back")) {

                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.pollLast()).append("\n");
                }

            } else if (str[0].equals("size")) {

                sb.append(deque.size()).append("\n");

            } else if (str[0].equals("empty")) {

                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }

            } else if (str[0].equals("front")) {

                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekFirst()).append("\n");
                }

            } else if (str[0].equals("back")) {

                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekLast()).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
