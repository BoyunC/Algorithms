package stage.o_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin11047 {
    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];
        int cnt = 0;

        for(int i=0; i<n; i++)
            coin[i] = Integer.parseInt(kb.readLine());

        for(int i=n-1; i>=0; i--) {
            if(coin[i] <= k) {
                cnt += k / coin[i];
                k %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}
