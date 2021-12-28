package stage.io;

/*
    문제 10998번 : A*B
*/

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        System.out.print(n*m);

        kb.close();
    }
}
