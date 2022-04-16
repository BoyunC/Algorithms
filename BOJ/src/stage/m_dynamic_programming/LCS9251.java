package stage.m_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS9251 {

    static char[] strA;
    static char[] strB;
    static Integer[][] dp;

    static int LCS(int x, int y){

        if(x == -1 || y == -1)
            return 0;

        if(dp[x][y] == null) {
            dp[x][y] = 0 ;

            if(strA[x] == strB[y])
                dp[x][y] = LCS(x-1, y-1) + 1;
            else
                dp[x][y] = Math.max(LCS(x-1, y) , LCS(x, y-1));
        }

        return dp[x][y];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        strA = kb.readLine().toCharArray();
        strB = kb.readLine().toCharArray();
        dp = new Integer[strA.length][strB.length];

        System.out.println(LCS(strA.length-1, strB.length-1));
    }
}
