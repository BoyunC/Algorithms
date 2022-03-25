package stage.l_backtracking;

/*
     문제 15649번 : N과 M(1)
*/

import java.util.Scanner;

public class NandM15650 {

    public static int[] arr;

    public static void dfs(int n, int m, int at, int depth) {
        if(depth == m) {
            for(int x: arr)
                System.out.print(x + " ");
            System.out.println();
            return;
        }

        for(int i=at; i<=n; i++){
            arr[depth] = i;
            dfs(n, m, i+1, depth+1);
        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        arr = new int[m];

        dfs(n, m, 1,0);

    }
}