package topics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6603 {
    static int k;
    static int[] S;
    static boolean[] check;

    public static void recursive(int depth, int start) {
        if(depth == 6) {
            for (int i = 0; i < k; i++) {
                if(check[i]) {
                    System.out.print(S[i] + " ");
                }
            }
            System.out.println();
        }

        for (int i = start; i < k; i++) {
            check[i] = true;
            recursive(depth + 1, i + 1);
            check[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String testCase = kb.readLine();

            if(testCase.equals("0")) {
                break;
            }

            String[] input = testCase.split(" ");
            k = Integer.parseInt(input[0]);
            S = new int[k];
            check = new boolean[k];

            for (int i = 0; i < k; i++) {
                S[i] = Integer.parseInt(input[i + 1]);
            }

            recursive(0, 0);
            System.out.println();
        }
    }
}
