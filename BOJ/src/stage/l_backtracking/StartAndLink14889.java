package stage.l_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StartAndLink14889 {

    static int MIN = Integer.MAX_VALUE;
    static int n;
    static int[][] map;
    static boolean[] check;

    static void combi(int index, int count){
        if( count == n/2){
            int start = 0;
            int link = 0;

            for(int i =0; i<n-1; i++) {
                for(int j=i+1; j<n; j++) {
                    if(check[i] == true && check[j] == true){
                        start += map[i][j];
                        start += map[j][i];
                    }
                    else if(check[i] == false && check[j] == false) {
                        link += map[i][j];
                        link += map[j][i];
                    }
                }
            }

            int val = Math.abs(start-link);

            if(val==0){
                System.out.println(val);
                System.exit(0);
            }

            MIN = Math.min(val, MIN);

            return;
        }

        for(int i=index; i<n; i++) {
            if(!check[i]){
                check[i] = true;
                combi(i+1, count+1);
                check[i] =false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(kb.readLine());

        map = new int[n][n];
        check = new boolean[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

            for(int j=0; j<n; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        combi(0, 0);
        System.out.println(MIN);
    }
}
