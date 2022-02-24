package stage.j_brute_force;

/*
     문제 2231번 : 분해합
*/

import java.util.Scanner;

public class Q2231 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int answer = 0;

        for(int i=0; i<n; i++) {
            int num = i;
            int sum = 0;

            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if(sum + i == n){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
