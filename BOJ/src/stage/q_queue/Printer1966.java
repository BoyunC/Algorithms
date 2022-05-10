package stage.q_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Printer1966 {

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(kb.readLine());
        while (t --> 0) {

            StringTokenizer st = new StringTokenizer(kb.readLine());
            LinkedList<int[]> queue = new LinkedList<>();

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(kb.readLine());

            for (int i = 0; i < n; i++) {
                queue.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while (!queue.isEmpty()) {

                int[] front = queue.poll();
                boolean isMax = true;

                for(int i = 0; i < queue.size(); i++) {
                    if(front[1] < queue.get(i)[1]) {
                        queue.offer(front);
                        for(int j = 0; j < i; j++) {
                            queue.offer(queue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }
                if(isMax == false) {
                    continue;
                }
                count++;
                if(front[0] == m) {
                    break;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
