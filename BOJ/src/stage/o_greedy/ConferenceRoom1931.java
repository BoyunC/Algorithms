package stage.o_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ConferenceRoom1931 {

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(kb.readLine());
        int cnt = 0;
        int end = 0;

        int[][] time = new int[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(kb.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, (o1, o2) -> {
            if(o1[1] == o2[1])
                return o1[0]-o2[0];
            return  o1[1] - o2[1];
        });

        for(int i=0; i<n; i++) {
            if(end <= time[i][0]){
                end = time[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
