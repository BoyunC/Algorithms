package stage.b_if;

/*
    문제 14681번 : 사분면 고르기
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QuadrantN14681 {

    public static void main(String[] args) throws IOException {
        //case 1.Scanner 이용
        Scanner kb = new Scanner(System.in);

        int x = kb.nextInt();
        int y = kb.nextInt();

        int quadrant;

        if(x>0) {
            if(y>0)
                quadrant = 1;
            else
                quadrant = 4;
        } else {
            if (y>0)
                quadrant = 2;
            else
                quadrant = 3;
        }

        System.out.println(quadrant);

        // case 2. BufferedReader 이용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        int m = Integer.parseInt(br.readLine());
//
//        int quadrant;
//
//        if(x>0) {
//            if(y>0)
//                quadrant = 1;
//            else
//                quadrant = 4;
//        } else {
//            if (y>0)
//                quadrant = 2;
//            else
//                quadrant = 3;
//        }

    }
}
