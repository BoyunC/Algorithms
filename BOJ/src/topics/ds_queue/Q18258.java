package topics.ds_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q18258 {

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(kb.readLine());

        while(n-->0) {
            StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

            switch (st.nextToken()) {
                case "push" :
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    Integer num = queue.poll();

                    if(num == null)
                        sb.append(-1);
                    else
                        sb.append(num);

                    sb.append("\n");
                    break;

                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;

                case "empty" :
                    if(queue.isEmpty())
                        sb.append(1);
                    else
                        sb.append(0);

                    sb.append("\n");
                    break;

                case "front" :
                    Integer num2 = queue.peek();

                    if(num2 == null)
                        sb.append(-1);
                    else
                        sb.append(num2);

                    sb.append("\n");
                    break;

                case "back" :
                    Integer num3 = queue.peekLast();

                    if(num3 == null)
                        sb.append(-1);
                    else
                        sb.append(num3);

                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
