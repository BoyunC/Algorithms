package stage.r_divide_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci11444 {

    public static long[][] pow(long[][] A, long exponential) {

        long[][] origin = {{1, 1} , {1, 0}};

        if(exponential == 1 || exponential == 0) {
            return A;
        }

        long[][] result = pow(A, exponential / 2);
        long[][] tmp = new long[2][2];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    tmp[i][j] += result[i][k] * result[k][j];
                    tmp[i][j] %= 1000000007;
                }
            }
        }
        result = tmp.clone();

        if(exponential % 2 == 1L) {
            tmp = new long[2][2];

            for(int i = 0; i < 2; i++) {
                for(int j = 0; j < 2; j++) {
                    for(int k = 0; k < 2; k++) {
                        tmp[i][j] += result[i][k] * origin[k][j];
                        tmp[i][j] %= 1000000007;
                    }
                }
            }

            result = tmp.clone();
        }


        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(kb.readLine());
        long[][] A = {{1, 1}, {1, 0}};

        System.out.println(pow(A, n - 1)[0][0]);

    }
}
