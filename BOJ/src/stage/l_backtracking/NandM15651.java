package stage.l_backtracking;

/*
     문제 15649번 : N과 M(3)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM15651 {
    public static int[] arr;
    public static int n, m;
    public static StringBuilder sb = new StringBuilder();

    public static void dfs(int depth) {
        if(depth == m){
            for(int i=0; i<m; i++)
                sb.append(arr[i] + " ");
            sb.append("\n");
            return;
        }

        for(int i=1; i<=n; i++) {
            arr[depth] = i;
            dfs(depth+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        dfs(0);
        System.out.println(sb);
    }
}
