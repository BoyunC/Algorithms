package stage.m_dynamic_programming;

/*
     문제 1003번 : 피보나치 함수
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci1003 {

    static Integer[][] dp = new Integer[41][2];

    static Integer[] fibonacci(int m) {

        if(dp[m][0] == null || dp[m][1] == null) {
            dp[m][0] = fibonacci(m-1)[0] + fibonacci(m-2)[0];
            dp[m][1] = fibonacci(m-1)[1] + fibonacci(m-2)[1];
        }

        return dp[m];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int n = Integer.parseInt(kb.readLine());

        StringBuilder sb = new StringBuilder();

        while(n --> 0) {
            int m = Integer.parseInt(kb.readLine());
            fibonacci(m);
            sb.append(dp[m][0] + " " + dp[m][1] + "\n");
        }

        System.out.println(sb);
    }
}
