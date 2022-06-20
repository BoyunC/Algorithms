package topics.recursion;

import java.util.Scanner;

public class Q11729 {
    private static StringBuilder sb = new StringBuilder();

    public static int countHanoi(int n) {
        if(n==1) {
            return 1;
        }else {
            return 2*countHanoi(n-1)+1;
        }
    }

    public static void hanoi(int n, int start, int end, int sub) {
        if(n == 1){
            System.out.println(start + " " + end );
            return;
        }

        hanoi(n-1, start, sub, end);
        hanoi(1, start, end, sub);
        hanoi(n-1, sub, end, start);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        sb.append(countHanoi(n));
        System.out.println(sb.toString());

        hanoi(n, 1, 3, 2);
    }
}
