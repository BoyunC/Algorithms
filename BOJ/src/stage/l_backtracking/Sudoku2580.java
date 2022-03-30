package stage.l_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sudoku2580 {

    static int[][] arr = new int[9][9];
    public static StringBuilder builder = new StringBuilder();

    public static void dfs(int row, int col) {
        if(col==9) {
            dfs(row+1, 0);
        }

        if(row==9) {
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++) {
                    builder.append(arr[i][j] + " ");
                }
                builder.append("\n");
                return;
            }
        }

        if(arr[row][col] == 0) {
            for(int i=1; i<9; i++){
                if(check(row, col, i)) {
                    arr[row][col] = i;
                    dfs(row, col+1);
                }
            }
            arr[row][col] = 0;
            return;
        }

        dfs(row, col+1);
    }

    public static boolean check(int row, int col, int value) {

        for(int i=0 ; i<9 ; i++) {
            if(arr[row][i] == value)
                return false;
        }

        for(int i=0 ; i<9 ; i++) {
            if(arr[i][col] == value)
                return false;
        }

        int in_row = (row/3)*3;
        int in_col = (col/3)*3;

        for(int i=in_row ; i<in_row+3 ; i++) {
            for(int j=in_col ; j<in_col+3 ; j++) {
                if(arr[i][j]==value)
                    return false;
            }
        }

        return true;
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
