package stage.l_backtracking;

/*
     문제 15649번 : N과 M(1)
*/

import java.util.Scanner;

public class NandM15649 {

    public static int[] arr;
    public static boolean[] visit;

    public static void dfs(int n, int m, int depth) {
        if(depth == m) {
            for(int x: arr)
                System.out.print(x + " ");
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++){
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i+1;
                dfs(n, m, depth+1);
                visit[i] = false;
            }
        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        visit = new boolean[n];
        arr = new int[m];

        dfs(n, m, 0);

    }
}
