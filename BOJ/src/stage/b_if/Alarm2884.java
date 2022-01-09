package stage.b_if;

/*
    문제 2884번 : 알람
*/

import java.util.Scanner;

public class Alarm2884 {
    public static void main(String[] args) {
        //case 1. Scanner 이용
        Scanner kb = new Scanner(System.in);

        int hour = kb.nextInt();
        int min = kb.nextInt();

        if(min < 45) {
            hour--;
            min = 60 - (45-min);

            if(hour<0){
                hour = 23;
            }
        }


    }
}
