package stage.a_io;

/*
    문제 1008번 : A/B
*/

import java.util.Scanner;

public class Division{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double n = kb.nextDouble();
        double m = kb.nextDouble();

        System.out.print(n/m);

        kb.close();
    }
}

