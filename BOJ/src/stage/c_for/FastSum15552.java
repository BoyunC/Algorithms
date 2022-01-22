package stage.c_for;

/*
    문제 15552번 : 빠른 A+B
*/

import java.io.*;
import java.util.StringTokenizer;

public class FastSum15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            bw.write(String.valueOf(arr[i][0]+arr[i][1]));
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
