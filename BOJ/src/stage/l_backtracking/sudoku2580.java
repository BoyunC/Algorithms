package stage.l_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sudoku2580 {

    static int[][] arr = new int[9][9];
    public static StringBuilder builder = new StringBuilder();

    public static void dfs(int row, int col) {
        if(col==9) {
            dfs(row+1, 0);
        } else if(row==9) {
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++) {
                    builder.append(arr[i][j] + " ");
                }
                builder.append("\n");
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(kb.readLine());
            for(int j=0; st.hasMoreTokens(); j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(builder);
    }
}
