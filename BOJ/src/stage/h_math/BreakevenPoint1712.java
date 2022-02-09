package stage.h_math;

/*
     문제 1712번 : 손익분기점
*/

import java.util.Scanner;

public class BreakevenPoint1712 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int fixed = kb.nextInt();
        int variable = kb.nextInt();
        int cost = kb.nextInt();

        int answer = 0;

        if(variable >= cost)
            answer = -1;
        else {
            answer = (fixed/(cost-variable))+1;
        }

        System.out.println(answer);
    }
}
