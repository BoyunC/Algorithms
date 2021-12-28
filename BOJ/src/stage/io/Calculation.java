package stage.io;

/*
    문제 10869번 : 사칙연산
*/

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        System.out.println(n+m);
        System.out.println(n-m);
        System.out.println(n*m);
        System.out.println(n/m);
        System.out.println(n%m);

        kb.close();
    }
}
