package stage.g_string;

/*
     문제 2675번 : 문자열 반복
*/

import java.util.Scanner;

public class Repetition2675 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] cnt = new int[n];
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            cnt[i] = kb.nextInt();
            str[i] = kb.next();
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<str[i].length(); j++){
                for(int k=0; k<cnt[i]; k++){
                    System.out.print(str[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
