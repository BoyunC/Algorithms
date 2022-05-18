package stage.r_divide_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumOfPaper1780 {

    public static int[][] board;
    public static int MINUS = 0;		// -1
    public static int ZERO = 0;	        // 0
    public static int PLUS = 0;	        // 1


    public static void partition(int row, int col, int size) {

        int color = board[row][col];
        boolean check = true;


        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color != board[i][j]) {
                    check = false;
                }
            }
        }

        if (check) {
            if(board[row][col] == -1) {
                MINUS++;
            }
            else if(board[row][col] == 0) {
                ZERO++;
            }
            else {
                PLUS++;
            }

            return;
        }

        int newSize = size / 3;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row, col + 2 * newSize, newSize);

        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        partition(row + newSize, col + 2 * newSize, newSize);

        partition(row + 2 * newSize, col, newSize);
        partition(row + 2 * newSize, col + newSize, newSize);
        partition(row + 2 * newSize, col + 2 * newSize, newSize);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, n);

        System.out.println(MINUS + "\n" + ZERO + "\n" + PLUS);

    }
}
