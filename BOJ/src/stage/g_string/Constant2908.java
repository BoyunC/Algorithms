package stage.g_string;

/*
     문제 2908번 : 상수
*/

import java.util.Scanner;

public class Constant2908 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();

        int cnstA = Integer.parseInt(a.charAt(2)+"" + a.charAt(1)+"" + a.charAt(0)+"");
        int cnstB = Integer.parseInt(b.charAt(2)+"" + b.charAt(1)+"" + b.charAt(0)+"");

        if(cnstA>cnstB)
            System.out.println(cnstA);
        else
            System.out.println(cnstB);

    }
}
