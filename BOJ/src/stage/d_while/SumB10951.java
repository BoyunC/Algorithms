package stage.d_while;

/*
    문제 10951번 : A+B -4
*/

import java.util.Scanner;

public class SumB10951 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while(kb.hasNext()) {
            int a = kb.nextInt();
            int b = kb.nextInt();

            System.out.println(a+b);
        }
    }
}
