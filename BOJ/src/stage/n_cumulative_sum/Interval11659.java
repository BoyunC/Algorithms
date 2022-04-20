package stage.n_cumulative_sum;

import java.io.*;
import java.util.StringTokenizer;

public class Interval11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] num = new int[n+1];
        int[] dp = new int[n+1];

        int start, end;

        st = new StringTokenizer(br.readLine());

        for (int i=1; i<=n; i++){
            num[i] = Integer.parseInt(st.nextToken());
            dp[i] = dp[i-1] + num[i];
        }

        for (int i=1; i<=m; i++){
            st = new StringTokenizer(br.readLine());

            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            sb.append(dp[end]-dp[start-1]+"\n");
        }

        System.out.println(sb);
    }
}
