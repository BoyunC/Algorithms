package stage.o_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GasStation13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(kb.readLine());
        long sum = 0;
        long min;

        long[] distance = new long[n-1];
        long[] cost = new long[n];

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");
        for(int i=0; i<n-1; i++)
            distance[i] = Long.parseLong(st.nextToken());

        st = new StringTokenizer(kb.readLine(), " ");
        for(int i=0; i<n; i++)
            cost[i] = Long.parseLong(st.nextToken());

        min = cost[0];

        for(int i=0; i<n-1; i++) {
            if(cost[i]<min)
                min = cost[i];

            sum += (min * distance[i]);
        }

        System.out.println(sum);
    }
}
