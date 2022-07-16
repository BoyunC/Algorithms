package topics.ds_queue;

import java.awt.*;
import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q3190 {
    public static int[][] map = new int[101][101];
    public static int[] dr = {-1, 0, 1, 0}; // 북, 동, 남, 서
    public static int[] dc = {0, 1, 0, -1};
    public static int[] time;
    public static char[] direction;
    public static Deque<Point> queue = new LinkedList<Point>();
    public static int N, K, L, answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            map[r][c] = 2;
        }

        L = Integer.parseInt(br.readLine());

        time = new int[L];
        direction = new char[L];

        for (int i = 0; i < L; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            time[i] = Integer.parseInt(st.nextToken());
            direction[i] = st.nextToken().charAt(0);
        }

        queue.add(new Point(1, 1));

        map[1][1] = 1;

        play(1, 1, 1);

        System.out.println(answer);
    }

    public static void play(int row, int col, int d) {
        int i = 0;

        while (true) {
            if (i < L && answer == time[i]) {

                if (direction[i] == 'D') {
                    d = (d + 1) % 4;
                } else if (direction[i] == 'L') {
                    d = (d + 3) % 4;
                }

                i++;
            }

            int next_r = row + dr[d];
            int next_c = col + dc[d];

            queue.addFirst(new Point(next_r, next_c));

            if (next_r <= 0 || next_c <= 0 || next_r > N || next_c > N) {
                answer++;
                break;
            }

            if (map[next_r][next_c] == 2) {
                map[next_r][next_c] = 1;
            } else if (map[next_r][next_c] == 0) {
                map[next_r][next_c] = 1;
                map[queue.peekLast().x][queue.peekLast().y] = 0;
                queue.pollLast();
            } else {
                answer++;
                break;
            }

            row = next_r;
            col = next_c;

            answer++;
        }
    }
}
