package stage.j_brute_force;

/*
     문제 1436번 : 영화감독 숌
*/

import java.util.Scanner;

public class Director1436 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int num = 666;
        int count = 1;

        while(count != n) {
            num++;
            if(String.valueOf(num).contains("666"))
                count++;
        }

        System.out.println(num);
    }
}
