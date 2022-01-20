package stage.c_for;

import java.util.Scanner;

public class PrintN2741 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        for(int i=0; i<n; i++) {
            System.out.println(i+1);
        }
    }
}
