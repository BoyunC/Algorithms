package stage.k_sort;

/*
     문제 2108번 : 통계학
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Statistics2108 {
    public static void main(String[] args) throws IOException  {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());

        int[] list = new int[n];
        int[] count = new int[n];

        int total = 0;
        int cnt = 1;

        for(int i=0; i<n; i++) {
            list[i] = Integer.parseInt(input.readLine());
            total += list[i];
        }

        Arrays.sort(list);

        for(int x: list)
            System.out.print(x + " ");

        System.out.println();

        count[0] = 1;
        for(int i=1; i<n; i++) {
            if(list[i] == list[i-1]){
                cnt++;
            } else {
                count[i] = cnt;
                cnt = 1;
            }
        }

        for(int x: count)
            System.out.print(x + " ");

        System.out.println();

        System.out.println(total/n);
        System.out.println(list[n/2]);
        System.out.println(list[n-1]-list[0]);

    }
}
