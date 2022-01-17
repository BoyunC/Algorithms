package stage.c_for;

import java.util.Scanner;

public class Array10950 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i][0]+arr[i][1]);
        }
    }
}
