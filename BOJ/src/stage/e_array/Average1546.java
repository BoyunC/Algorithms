package stage.e_array;

/*
    문제 1546번 : 평균
*/

import java.util.Scanner;

public class Average1546 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int total = 0;

        for(int i=0; i<n; i++)
            arr[i] = kb.nextInt();

        for(int x : arr){
            if(max < x)
                max = x;
            total += x;
        }

        System.out.println((100*(total))/(float)(n*max));
    }
}
