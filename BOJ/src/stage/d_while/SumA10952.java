package stage.d_while;

/*
    문제 10952번 : A+B -5
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SumA10952 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int sum = Integer.MAX_VALUE;
        ArrayList<Integer> answer = new ArrayList<>();

        while(sum != 0) {
            int a = kb.nextInt();
            int b = kb.nextInt();

            sum = a+b;
            if(sum != 0)
                answer.add(sum);
        }

        for(int x: answer)
            System.out.println(x + " ");

    }
}
