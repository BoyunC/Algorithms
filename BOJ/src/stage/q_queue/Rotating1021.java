package stage.q_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Rotating1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        LinkedList<Integer> deque = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        int[] sequence = new int[m];

        st = new StringTokenizer(kb.readLine(), " ");
        for (int i = 0; i < m; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int pick = deque.indexOf(sequence[i]);
            int half;

            if(deque.size() % 2 == 0) {
                half = deque.size() / 2 - 1;
            } else  {
                half = deque.size() / 2;
            }

            if(pick <= half) {
                for (int j = 0; j < pick; j++) {
                    int tmp = deque.pollFirst();
                    deque.offerLast(tmp);
                    cnt++;
                }
            } else {
                for (int j = 0; j < deque.size() - pick; j++) {
                    int tmp = deque.pollLast();
                    deque.offerFirst(tmp);
                    cnt++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt);
    }
}
