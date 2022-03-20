package stage.k_sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortOfCordinate11651 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = kb.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            arr[i][1] = kb.nextInt();
            arr[i][0] = kb.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < n; i++) {
            sb.append(arr[i][1] + " " + arr[i][0]+ "\n");
        }
        System.out.println(sb);
    }
}
