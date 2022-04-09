package stage.m_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeOne1463 {

    static Integer[] dp;

    static int cal(int n) {
        if(dp[n] == null) {
            if(n%6 == 0)
                dp[n] = Math.min(cal(n-1), Math.min(cal(n/3), cal(n/2))) + 1;
            else if(n%3 == 0)
                dp[n] = Math.min(cal(n/3), cal(n-1)) + 1;
            else if(n%2 == 0)
                dp[n] = Math.min(cal(n/2), cal(n-1)) + 1;
            else
                dp[n] = cal(n-1) + 1;
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(kb.readLine());
        dp = new Integer[n+1];

        dp[0] = 0;
        dp[1] = 0;

        System.out.println(cal(n));
    }
}

