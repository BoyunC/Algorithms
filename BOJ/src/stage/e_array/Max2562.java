package stage.e_array;

/*
    문제 2562번 : 최댓값
*/

import java.util.Scanner;

public class Max2562 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
        int answer = 0;

        for(int i=0; i<9; i++)
            arr[i] = kb.nextInt();

        for(int i=0; i<9; i++) {
            if(max < arr[i]) {
                max = arr[i];
                answer = i+1;
            }
        }

        System.out.println(max);
        System.out.println(answer);
    }
}
