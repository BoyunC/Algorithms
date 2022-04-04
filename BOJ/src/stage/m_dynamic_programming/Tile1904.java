package stage.m_dynamic_programming;

/*
     문제 1904번 : 01타일
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile1904 {

    public static int[] dp = new int[1000001];;

    public static int count(int n) {

        if(dp[n] == -1) {
            dp[n] = (count(n - 1) + count((n - 2))) % 15746;
        }

        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }

        System.out.println(count(n));
    }
}
