package topics.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Q2447 {

    public static char[][] arr;

    public static void print(int n, int x, int y) {
        if(n == 1){
            arr[x][y] = '*';
            return;
        }

        int value = n/3;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i != 1 || j != 1)
                    print(value, x + (value * i), y + (value * j));
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        arr = new char[n][n];

        for(int i = 0; i < n; i++)
            Arrays.fill(arr[i], ' ');

        print(n, 0, 0);

        for(int i = 0; i < n; i++)
            System.out.println(arr[i]);

    }
}
