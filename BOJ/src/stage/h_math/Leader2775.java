package stage.h_math;

/*
     문제 2775번 : 부녀회장이 될테야
*/


import java.util.Scanner;

public class Leader2775 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();

        int[][] apt = new int[15][15];

        for(int i=0; i<15; i++){
            apt[i][0] = 1;
            apt[0][i] = i;
        }

        for(int i=1; i<15; i++) {
            for(int j=2; j<15; j++) {
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
            }
        }

        for(int i=0; i<t; i++) {
            int k = kb.nextInt();
            int n = kb.nextInt();
            System.out.println(apt[k][n]);
        }
    }
}
