package stage.h_math;

/*
     문제 2292번 : 벌집
*/

import java.util.Scanner;

public class Hive2292 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int sum = 2;
        int answer = 0;

        int n = kb.nextInt();

        if(n==1)
            answer = 1;
        while (n >= sum){
            sum += 6 * (answer++);
        }

        System.out.println(answer);
    }
}
