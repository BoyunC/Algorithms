package stage.e_array;

/*
    문제 2577번 : 숫자의 개수
*/

import java.util.Scanner;

public class NumOfNum2577 {

    public static int multiple(int a, int b, int c) {
        return a*b*c;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int mul = multiple(kb.nextInt(),kb.nextInt(), kb.nextInt());
        int[] arr = new int[10];

        while(mul>0) {
            int remainder = mul % 10;
            arr[remainder]++;
            mul = mul/10;
        }

        for(int x : arr)
            System.out.println(x);
    }
}
