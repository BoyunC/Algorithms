package stage.q_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++)
            queue.add(i);

        sb.append('<');

        while (queue.size()>1) {
            for(int i=0; i<k-1; i++)
                queue.offer(queue.poll());

            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append('>');

        System.out.println(sb);
    }
}
