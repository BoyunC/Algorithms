package stage.g_string;

/*
     문제 1152번 : 단어의 개수
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumOfVoca1152 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.println(st.countTokens());
    }
}
