package stage.m_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle1932 {

    static Integer[][] dp;
    static int[][] triangle;
    static int n;

    public static int route(int depth, int index) {
        if(depth == n-1)
            return dp[depth][index];

        if(dp[depth][index] == null)
            dp[depth][index] = Math.max(route(depth+1, index), route(depth+1, index+1))
                                + triangle[depth][index];

        return dp[depth][index];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(kb.readLine());

        triangle = new int[n][n];
        dp = new Integer[n][n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

            for(int j=0; j<i+1; j++)
                triangle[i][j] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++)
            dp[n-1][i] = triangle[n-1][i];

        System.out.println(route(0,0));
    }
}
