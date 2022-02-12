package stage.h_math;

/*
     문제 2869번 : 달팽이는 올라가고 싶다
*/

import java.util.Scanner;

public class Snail2869 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int day = kb.nextInt();
        int night = kb.nextInt();
        int height = kb.nextInt();

        int answer = (height-night)/(day-night)+1;

        if((height-night)%(day-night)==0)
            answer--;

        System.out.println(answer);
    }
}
