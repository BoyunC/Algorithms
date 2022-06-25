package topics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1074 {

    static int cnt = 0;

    public static void recursive(int size, int r, int c) {
        if (size == 1) {
            return;
        }

        if(r < size / 2 && c < size / 2) {
            recursive(size / 2,  r, c);
        } else if (r < size / 2 && c >= size / 2) {
            cnt += size * size / 4;
            recursive(size / 2, r, c - size / 2);
        } else if (r >= size / 2 && c < size / 2) {
            cnt += (size * size / 4) * 2;
            recursive(size / 2 , r - size / 2, c);
        } else {
            cnt += (size * size / 4) * 3;
            recursive(size / 2 , r - size /2 , c - size / 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, N);

        recursive(size, r, c);
        System.out.println(cnt);

    }

}
