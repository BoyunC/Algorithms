package stage.h_math;

/*
     문제 1193번 : 분수찾기
*/

import java.util.Scanner;

public class FindFraction1193 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int layer = 1;
        int endNum = 0;
        int numerator = 0;       // 분자
        int denominator = 0;    // 분모

        int n = kb.nextInt();

        while(n > endNum){
            endNum += layer++;
        }

        if(layer%2==0){
            numerator = endNum - n + 1;
            denominator = layer - numerator;
        } else {
            denominator = endNum - n + 1;
            numerator = layer - denominator;
        }

        System.out.println(numerator+"/"+denominator);
    }
}
