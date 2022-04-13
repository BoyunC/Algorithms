package stage.m_dynamic_programming;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bitonic11054 {

    static Integer[] r_dp;
    static Integer[] l_dp;
    static int[] sequence;

    static int LDS(int n) {
        if(l_dp[n] == null) {
            l_dp[n] = 1;

            for(int i=n+1; i<l_dp.length; i++) {
                if(sequence[i]<sequence[n]) {
                    l_dp[n] = Math.max(l_dp[n], LDS(i) + 1);
                }
            }
        }
        return l_dp[n];
    }

    static int LIS(int n) {
        if(r_dp[n] == null) {
            r_dp[n] = 1;
            for(int i=n-1; i>=0; i--) {
                if(sequence[i] < sequence[n]) {
                    r_dp[n] = Math.max(r_dp[n], LIS(i) + 1);
                }
            }
        }
        return r_dp[n];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;

        sequence = new int[n];
        r_dp = new Integer[n];
        l_dp = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            LIS(i);
            LDS(i);
        }

        for(int i = 0; i < n; i++) {
            max = Math.max(r_dp[i] + l_dp[i], max);
        }

        System.out.println(max - 1);
    }
}
