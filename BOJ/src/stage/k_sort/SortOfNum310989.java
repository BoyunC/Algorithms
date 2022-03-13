package stage.k_sort;

/*
     문제 2750번 : 수 정렬하기
*/

import java.io.*;
import java.util.Arrays;

public class SortOfNum310989 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(input.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
             arr[i] = Integer.parseInt(input.readLine());
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++)
            output.write(arr[i] + "\n");

        output.close();
    }
}
