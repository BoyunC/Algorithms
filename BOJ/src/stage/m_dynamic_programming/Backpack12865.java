package stage.m_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backpack12865 {

    static int[] weight;
    static int[] value;
    static Integer[][] dp;

    static int solution(int i, int k){
        if(i<0)
            return 0;

        if(dp[i][k] == null ) {
            if(weight[i] > k)
                dp[i][k] = solution(i-1, k);
            else
                dp[i][k] = Math.max(solution(i-1, k), solution(i-1, k-weight[i])+value[i]);
        }
        return dp[i][k];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        weight = new int[n];
        value = new int[n];

        dp = new Integer[n][k+1];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(kb.readLine(), " ");
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n-1, k));
    }
}
