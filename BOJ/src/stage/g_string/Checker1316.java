package stage.g_string;

/*
     문제 1316번 : 체커
*/

import java.util.Arrays;
import java.util.Scanner;

public class Checker1316 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] cnt = new int[26];
        boolean checker = true;
        int answer = 0;

        int n = kb.nextInt();
        String[] list = new String[n];

        for(int i=0; i<n; i++){
            list[i] = kb.next();
        }

        for(int i=0; i<n; i++) {
            Arrays.fill(cnt, 0);
            checker = true;

            for(int j=0; j<list[i].length(); j++) {
                if(cnt[list[i].charAt(j)-'a']==1){
                    if(list[i].charAt(j-1)!=list[i].charAt(j)){
                        checker = false;
                        break;
                    }
                } else {
                    cnt[list[i].charAt(j)-'a']++;
                }
            }

            if(checker)
                answer++;
        }

        System.out.println(answer);
    }
}
