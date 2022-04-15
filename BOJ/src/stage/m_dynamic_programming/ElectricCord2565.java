package stage.m_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ElectricCord2565 {

    static int[][] cord;
    static Integer[] dp;

    static int solution(int n) {
        if(dp[n] == null) {
             dp[n] = 1;

             for(int i=n+1; i<dp.length; i++) {
                 if(cord[n][1] < cord[i][1])
                     dp[n] = Math.max(dp[n], solution(i) + 1 );
            }
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(kb.readLine());
        int max = Integer.MIN_VALUE;

        dp = new Integer[n];
        cord = new int[n][2];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

            cord[i][0] = Integer.parseInt(st.nextToken());
            cord[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cord, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i=0; i<n; i++) {
            max = Math.max(solution(i) , max);
        }

        System.out.println(n-max);
    }
}
