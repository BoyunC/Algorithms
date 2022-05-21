package stage.r_divide_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Matrix2740 {
    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k;

        int[][] A = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(kb.readLine(), " ");
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(kb.readLine(), " ");

        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[][] B = new int[m][k];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(kb.readLine(), " ");
            for (int j = 0; j < k; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                int sum = 0;
                for (int l = 0; l < m; l++) {
                    sum += A[i][l] * B[l][j];
                }
                sb.append(sum).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
