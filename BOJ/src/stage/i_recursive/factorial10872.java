package stage.i_recursive;

/*
     문제 10872번 : 팩토리얼
*/


import java.util.Scanner;

public class factorial10872 {

    public static  int factorial(int n) {
        if(n > 1)
            return  n * factorial(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(factorial(n));
    }
}
