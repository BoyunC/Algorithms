package stage.m_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum1912 {

    static int[] arr;
    static Integer[] dp;
    static int max;

    static int solution(int n) {
        if(dp[n] == null)
            dp[n] = Math.max(solution(n-1) + arr[n], arr[n]);

        max = Math.max(dp[n], max);

        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(kb.readLine());

        arr = new int[n];
        dp = new Integer[n];

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        dp[0] = arr[0];
        max = arr[0];

        solution(n-1);
        System.out.println(max);
    }
}
