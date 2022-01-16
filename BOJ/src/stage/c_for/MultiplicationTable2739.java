package stage.c_for;

/*
    문제 2739번 : 구구단
*/

import java.util.Scanner;

public class MultiplicationTable2739 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        for(int i=1; i<10; i++){
            System.out.println(n + " * " + i + " = " + (n*i) );
        }
    }
}
