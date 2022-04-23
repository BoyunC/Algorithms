package stage.n_cumulative_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Interval11660 {

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];

        for(int i=1; i<=n; ++i)
        {
            st = new StringTokenizer(kb.readLine(), " ");

            for(int j=1; j<=n; ++j)
            {
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = dp[i-1][j] + dp[i][j-1] -dp[i-1][j-1] + map[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; ++i)
        {
            st = new StringTokenizer(kb.readLine(), " ");
            int start_x = Integer.parseInt(st.nextToken());
            int start_y = Integer.parseInt(st.nextToken());
            int end_x = Integer.parseInt(st.nextToken());
            int end_y = Integer.parseInt(st.nextToken());

            int res = dp[end_x][end_y] - dp[end_x][start_y-1] - dp[start_x-1][end_y] + dp[start_x-1][start_y-1];

            sb.append(res+ "\n");
        }
        System.out.print(sb);
    }
}
