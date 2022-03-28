package stage.l_backtracking;

/*
     문제 15649번 : N과 M(4)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM15652 {

    public static int n, m;
    public static int[] arr;
    public static StringBuilder builder = new StringBuilder();

    public static void dfs(int at, int depth) {

        if( depth == m) {
            for(int x: arr)
                builder.append(x + " ");
            builder.append("\n");
            return;
        }

        for(int i=at; i<=n; i++) {
            arr[depth] = i;
            dfs(i, depth+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(1, 0);
        System.out.println(builder);
    }
}
