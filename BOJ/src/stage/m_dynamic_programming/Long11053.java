package stage.m_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Long11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(kb.readLine());
        int max = Integer.MIN_VALUE;

        int[] dp = new int[n];
        int[] sequence = new int[n];

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

        for(int i=0; i<n; i++)
            sequence[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            dp[i] = 1;

            for(int j=0; j<i; j++) {
                 if(sequence[i]>sequence[j] && dp[i]< (dp[j] +1))
                     dp[i] = dp[j]+1;
            }
        }

        for(int i=0; i<n; i++){
            if(dp[i] > max)
                max = dp[i];
        }

        System.out.println(max);
    }
}
