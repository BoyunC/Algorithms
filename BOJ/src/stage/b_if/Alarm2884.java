package stage.b_if;

/*
    문제 2884번 : 알람
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Alarm2884 {
    public static void main(String[] args) throws IOException {
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
        } else
            min -= 45;

        System.out.println(hour + " " + min);

        //case 2. BufferedReader + StringTokenizer 이용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int hour = Integer.parseInt(st.nextToken());
//        int min = Integer.parseInt(st.nextToken());
//
//        if(min < 45) {
//            hour--;
//            min = 60 - (45-min);
//
//            if(hour<0){
//                hour = 23;
//            }
//        } else
//            min -= 45;
//
//        System.out.println(hour + " " + min);
    }
}
