package stage.s_binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Card10816 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(findEnd(arr, key) - findStart(arr, key)).append(' ');
        }
        System.out.println(sb);
    }

    private static int findStart(int[] arr, int key) {
        int left = 0;
        int right = arr.length;

        while (left < right) {

            int mid = (left + right) / 2;

            if (key <= arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static int findEnd(int[] arr, int key) {
        int left =  0;
        int right = arr.length;

        while (left < right) {

            int mid = (left + right) / 2;

            if (key < arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
