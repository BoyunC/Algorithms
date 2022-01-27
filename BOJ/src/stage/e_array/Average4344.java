package stage.e_array;

/*
    문제 4344번 : 평균은 넘겠지
*/

import java.util.Arrays;
import java.util.Scanner;

public class Average4344 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[][] arr = new int[n][1001];
        float[] average= new float[n];

        //입력
        for(int i=0; i<n; i++){
            Arrays.fill(arr[i], -1);
            int m = kb.nextInt();
            arr[i][0] = m;
            for(int j=1; j<m+1; j++)
                arr[i][j] = kb.nextInt();
        }

        for(int i=0; i<n; i++){

            int student = 0;

            for(int j=1; j<arr[i][0]+1; j++){
                average[i] += arr[i][j];
            }

            average[i] /= (float)arr[i][0];

            for(int j=1; j<arr[i].length; j++){
                if(average[i]<arr[i][j])
                    student++;
            }

            System.out.println(String.format("%.3f", (student/(float)arr[i][0])*100) + "%");
        }
    }
}
