package stage.g_string;

/*
     문제 10809번 : 알파벳 찾기
*/

import java.util.Arrays;
import java.util.Scanner;

public class FindAlphabet10809 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String input = kb.next();

        for(int i=0; i<input.length(); i++){
            if(arr[input.charAt(i)-'a'] == -1){
                arr[input.charAt(i)-'a'] = i;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
