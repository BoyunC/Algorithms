package stage.c_for;

/*
    문제 11021번 : A+B -7
*/

import java.util.Scanner;

public class Case11021 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }

        for(int i=0; i<n; i++) {
            System.out.print("Case #" + (i+1) + ": ");
            System.out.println(arr[i][0]+arr[i][1]);
        }

    }
}
