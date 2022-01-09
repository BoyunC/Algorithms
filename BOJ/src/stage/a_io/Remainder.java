package stage.a_io;

/*
    문제 10430번 : 나머지
*/

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int A = kb.nextInt();
        int B = kb.nextInt();
        int C = kb.nextInt();

        System.out.println( (A+B) % C );
        System.out.println( (A%C + B%C) % C );
        System.out.println( (A*B) % C );
        System.out.println( (A%C * B%C) % C );

        kb.close();
    }
}
