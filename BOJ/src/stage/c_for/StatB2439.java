package stage.c_for;

import java.util.Scanner;

public class StatB2439 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        for(int i=0; i<n; i++){
            for(int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
