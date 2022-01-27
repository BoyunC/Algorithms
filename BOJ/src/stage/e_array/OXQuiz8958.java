package stage.e_array;

/*
    문제 8958번 : OX퀴즈
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuiz8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++)
            arr[i] = br.readLine();

        for(int i=0; i<n; i++){
            int answer = 0;
            int tmp = 0;

            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j)=='O') {
                    tmp++;
                    answer += tmp;
                }
                else
                    tmp = 0;
            }
            System.out.println(answer);
        }
    }
}
