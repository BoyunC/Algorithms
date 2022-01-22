package stage.c_for;

/*
    문제 2742번 : 기찍 N
*/

import java.util.Scanner;

public class DescendingPrintN2742 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        for(int i=n; i>0; i--){
            System.out.println(i);
        }
    }
}
