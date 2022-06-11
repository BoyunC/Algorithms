package topics.recursion;

import java.util.Scanner;

public class Q10870 {
    static int[] fibonacci;
    public static int recursion(int n) {

        if(n <= 1) {
            return fibonacci[n] = n;
        } else {
            return fibonacci[n] = recursion(n - 1) + recursion(n - 2);
        }

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        fibonacci = new int[n + 1];

        recursion(n);

        System.out.println(fibonacci[n]);
    }
}
