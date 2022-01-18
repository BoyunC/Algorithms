package stage.c_for;

/*
    문제 8393번 : 합
*/

import java.util.Scanner;

public class Sum8393 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int answer = 0;

        for(int i=1; i<=n; i++){
            answer += i;
        }

        System.out.println(answer);
    }
}
