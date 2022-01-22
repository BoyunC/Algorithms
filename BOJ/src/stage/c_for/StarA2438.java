package stage.c_for;

/*
    문제 2438번 : 별 찍기 -1
*/

import java.util.Scanner;

public class StarA2438 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
