package topics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1992 {
    public static int[][] video;
    public static StringBuilder sb = new StringBuilder();

    public static void QuadTree(int x, int y, int size) {

        int value = video[x][y];
        boolean isPossible = true;

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if(value != video[i][j]) {
                    isPossible = false;
                }
            }
        }

        if (isPossible) {
            sb.append(video[x][y]);
            return;
        }

        sb.append('(');

        QuadTree(x, y, size/2) ;
        QuadTree(x, y + (size/2), size/2) ;
        QuadTree(x + (size/2), y, size/2) ;
        QuadTree(x + (size/2), y + (size/2), size/2) ;

        sb.append(')');
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(kb.readLine());
        video = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = kb.readLine();

            for (int j = 0; j < n; j++) {
                video[i][j] = Integer.parseInt(str.charAt(j)+"");
            }
        }

        QuadTree(0, 0, n);
        System.out.println(sb);
    }
}
