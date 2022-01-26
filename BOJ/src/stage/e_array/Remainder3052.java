package stage.e_array;

/*
    문제 3052번 : 나머지
*/

import java.util.Scanner;

public class Remainder3052 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] arr = new int[10];
        int[] remainder = new int[42];
        int answer = 0;

        for(int i=0; i<10; i++){
            arr[i] = kb.nextInt();
        }

        for(int x : arr) {
            remainder[x%42]++;
        }

        for(int x : remainder) {
            if(x>0)
                answer++;
        }

        System.out.println(answer);
    }
}
