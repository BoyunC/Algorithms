package stage.k_sort;

/*
     문제 11650번 : 좌표 정렬하기
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortOfCordinate11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(kb.readLine());
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(kb.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2)-> {
            if(e1[0] == e2[0])
                return e1[1] - e2[1];
            else
                return e1[0] - e2[0];
        });

        for(int i=0; i<n; i++)
            System.out.println(arr[i][0] + " " + arr[i][1]);
    }
}
