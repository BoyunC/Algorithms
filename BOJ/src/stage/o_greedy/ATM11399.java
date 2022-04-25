package stage.o_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM11399 {
    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(kb.readLine());
        int time = 0;
        int people = 0;

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            people += time + arr[i];

            time += arr[i];
        }
        System.out.println(people);
    }
}
