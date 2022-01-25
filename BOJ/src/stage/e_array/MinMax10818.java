package stage.e_array;

/*
    문제 10818번 : 최소, 최대
*/

import java.util.Scanner;

public class MinMax10818 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
            arr[i] = kb.nextInt();

        for(int x : arr) {
            if(max < x)
                max = x;
            if(min > x)
                min = x;
        }

        System.out.println(min + " " + max);
    }
}
