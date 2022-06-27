package topics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2630 {
    public static int white = 0;
    public static int blue = 0;

    public static void checkPartition(int row, int col, int size, int[][] board) {

        int color = board[row][col];
        boolean checkColor = true;

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if(board[i][j] != color){
                    checkColor = false;
                }
            }
        }

        if(checkColor) {
            if(board[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        checkPartition(row, col, size /2, board);
        checkPartition(row, col + (size/2), size /2, board);
        checkPartition(row + (size/2), col, size /2, board);
        checkPartition(row + (size/2), col + (size/2), size /2, board);


    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(kb.readLine());
        int[][] board = new int[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(kb.readLine(), " ");

            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        checkPartition(0, 0, n, board);

        System.out.println(white);
        System.out.println(blue);

    }
}
