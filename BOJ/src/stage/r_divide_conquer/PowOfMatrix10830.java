package stage.r_divide_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PowOfMatrix10830 {

    public static int n;
    public static int[][] origin;

    public static int[][] pow(int[][] A, long exp) {
        if(exp == 1L) {
            return A;
        }

        int[][] ret = pow(A, exp / 2);
        int[][] tmp = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    tmp[i][j] += ret[i][k] * ret[k][j];
                    tmp[i][j] %= 1000;
                }
            }
        }
        ret = tmp.clone();

        if(exp % 2 == 1L) {
            tmp = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    for(int k = 0; k < n; k++) {
                        tmp[i][j] += ret[i][k] * origin[k][j];
                        tmp[i][j] %= 1000;
                    }
                }
            }
            ret = tmp.clone();
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        origin = new int[n][n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++) {

                origin[i][j] = Integer.parseInt(st.nextToken()) % 1000;
            }
        }

        int[][] result = pow(origin, B);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sb.append(result[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
