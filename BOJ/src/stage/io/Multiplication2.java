package stage.io;

/*
    문제 2588번 : 곱셈
*/

import java.util.Scanner;

public class Multiplication2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        System.out.println(n * (m % 10));
        System.out.println(n * (m % 100/10));
        System.out.println(n * (m / 100));
        System.out.println(n * m);

        kb.close();
    }
}