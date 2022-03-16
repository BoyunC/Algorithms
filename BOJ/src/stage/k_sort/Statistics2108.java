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

        int total = 0;
        int cnt = 1;

        boolean flag = false;
        int mode = Integer.MAX_VALUE;
        int max = 0;

        for(int i=0; i<n; i++) {
            list[i] = Integer.parseInt(input.readLine());
            total += list[i];
        }

        Arrays.sort(list);

        for(int i=0; i<n; i++) {
            int jump = 0;
            int count = 1;
            int value = list[i];

            for(int j= 1+i; j<n; j++){
                if(value != list[j])
                    break;
                count++;
                jump++;
            }

            if(count > max) {
                max = count;
                mode = value;
                flag = true;
            } else if(count == max && flag == true) {
                mode = value;
                flag = false;
            }

            i += jump;
        }

        System.out.println((int)Math.round((double)total / n));
        System.out.println(list[n/2]);
        System.out.println(mode);
        System.out.println(list[n-1]-list[0]);

    }
}
