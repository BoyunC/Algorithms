package stage.g_string;

/*
     문제 5622번 : 다이얼
*/

import java.util.Scanner;

public class Dial5622 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int answer = 0;

        String str = kb.next();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)-'A' < 15){
                answer += (str.charAt(i)-'A')/3 + 3;
            } else if (str.charAt(i)-'A' < 19){
                answer += 8;
            } else if (str.charAt(i)-'A' < 22){
                answer += 9;
            } else if (str.charAt(i)-'A' < 26){
                answer += 10;
            }
        }

        System.out.println(answer);
    }
}
