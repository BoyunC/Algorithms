package stage.b_if;

/*
    문제 2480번 : 주사위
*/

import java.util.Scanner;

public class Dice2480 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int answer = 0;

        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();

        if(a==b && b==c && a==c) {
            answer = 10000 + a * 1000;
        } else if(a!=b && b!=c && c!=a) {
            answer = Math.max( Math.max(a,b), c) * 100;
        } else {
            if(a==b) {
                answer = 1000 + a * 100;
            } else if(b==c) {
                answer = 1000 + b * 100;
            } else if(c==a) {
                answer = 1000 + c * 100;
            }
        }

        System.out.println(answer);
    }
}
