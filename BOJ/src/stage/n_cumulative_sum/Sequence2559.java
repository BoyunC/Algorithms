package stage.n_cumulative_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sequence2559 {
    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine(),  " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;

        int[] temp = new int [n];

        st = new StringTokenizer(kb.readLine(),  " ");

        for(int i=0; i<n; i++)
            temp[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<=n-k; i++) {
            int sum =0;

            for ( int j=i; j<i+k; j++) {
                sum += temp[j];
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
