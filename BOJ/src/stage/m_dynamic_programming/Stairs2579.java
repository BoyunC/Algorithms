package stage.m_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stairs2579 {

    static int[] arr;
    static Integer[] dp;
    static int n;

    static int max(int n) {
        if(dp[n] == null)
            dp[n] = Math.max(max(n-2), max(n-3) + arr[n-1]) + arr[n];

        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(kb.readLine());

        arr = new int[n+1];
        dp = new Integer[n+1];

        for(int i=1; i<=n; i++)
            arr[i] = Integer.parseInt(kb.readLine());

        dp[0] = arr[0];
        dp[1] = arr[1];

        if(n>=2)
            dp[2] = arr[1]+arr[2];

        System.out.println(max(n));
    }
}
