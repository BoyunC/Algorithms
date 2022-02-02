package stage.g_string;

/*
     문제 11720번 : 숫자의 합
*/

import java.util.Scanner;

public class SumOfNum11720 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int answer = 0;

        int count = kb.nextInt();

        String str = kb.next();

        for(int i=0; i<count; i++){
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        System.out.println(answer);
    }
}
