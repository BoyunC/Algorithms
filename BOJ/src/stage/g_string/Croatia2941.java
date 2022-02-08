package stage.g_string;

/*
     문제 2941번 : 크로아티아 알파벳
*/

import java.util.Scanner;

public class Croatia2941 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int answer = 0;

        String[] croatias = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String str = kb.next();

        for(int i=0; i<str.length(); i++){

            for(int j=0; j<8; j++) {
                if(str.contains(croatias[j])) {
                    answer++;
                    str = str.replaceFirst(croatias[j], " ");
                    break;
                }
            }
        }

        str = str.replaceAll(" ", "");
        answer += str.length();

        System.out.println(answer);
    }
}
