package stage.i_recursive;

/*
     문제 10870번 : 피보나치 수 5
*/


import java.util.Scanner;

public class Fibonacci10870 {

    public static int fibonacci(int n) {
        if(n<=1)
            return n;
        else
            return fibonacci(n-2) + fibonacci(n-1);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(fibonacci(n));
    }
}
