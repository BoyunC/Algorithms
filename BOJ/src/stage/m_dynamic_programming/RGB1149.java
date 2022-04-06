package stage.m_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB1149 {

    final static int R = 0;
    final static int G = 1;
    final static int B = 2;

    static int[][] cost;
    static int[][] dp;

    static int paintCost(int n, int color) {

        if(dp[n][color]==0) {
            if(color==R)
                dp[n][R] = Math.min(paintCost(n-1, G), paintCost(n-1, B)) + cost[n][R];
            else if(color==G)
                dp[n][G] = Math.min(paintCost(n-1, R), paintCost(n-1, B)) + cost[n][G];
            else
                dp[n][B] = Math.min(paintCost(n-1, R), paintCost(n-1, G)) + cost[n][B];
        }

        return dp[n][color];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        cost = new int[n][3];
        dp = new int[n][3];

        for(int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            cost[i][R] = Integer.parseInt(st.nextToken());
            cost[i][G] = Integer.parseInt(st.nextToken());
            cost[i][B] = Integer.parseInt(st.nextToken());
        }

        dp[0][R] = cost[0][R];
        dp[0][G] = cost[0][G];
        dp[0][B] = cost[0][B];

        System.out.println(Math.min(paintCost(n-1, R), Math.min(paintCost(n-1, G), paintCost(n-1, B))));
    }

}
