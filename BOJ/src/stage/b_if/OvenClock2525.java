package stage.b_if;

/*
    문제 2525번 : 오븐시계
*/

import java.util.Scanner;

public class OvenClock2525 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int hour = kb.nextInt();
        int minute = kb.nextInt();

        int time = kb.nextInt();

        minute += time;

        if(minute>60){
            hour += minute / 60;
            minute = minute % 60;
        }

        if(hour>23)
            hour %= 24;

        System.out.println(hour + " " + minute);
    }
}
