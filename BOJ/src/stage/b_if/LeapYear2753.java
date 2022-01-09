package stage.b_if;

/*
    문제 2753번 : 윤년
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeapYear2753 {
    public static void main(String[] args) throws IOException {
        //case 1. Scanner 이용
        Scanner kb = new Scanner(System.in);

        int year = kb.nextInt();

        if(year%4==0){
            if(year%100!=0 || year%400==0){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }

        // case2. BufferedReader 이용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int year = Integer.parseInt(br.readLine());
//
//        if(year%4==0){
//            if(year%100!=0 || year%400==0){
//                System.out.println(1);
//            } else {
//                System.out.println(0);
//            }
//        } else {
//            System.out.println(0);
//        }

    }
}
