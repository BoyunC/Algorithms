package stage.j_brute_force;

/*
     문제 1018번 : 체스판 다시 칠하기
*/


import java.util.Scanner;

public class Chess1018 {
    static boolean[][] map;
    static int min = 64;

    public static void find(int x, int y){
        int x_end = x + 8;
        int y_end = y + 8;

        int count = 0;

        boolean first = map[x][y];

        for(int i=x; i<x_end; i++) {
            for(int j=y; j<y_end; j++) {
                if(map[i][j] != first)
                    count++;

                first = (!first);
            }
            first = !first;
        }

        count = Math.min(count, 64-count);

        min = Math.min(min, count);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        map = new boolean[n][m];

        kb.nextLine();

        for(int i=0; i<n; i++) {
            String str = kb.nextLine().trim();

            for(int j=0; j<m; j++) {
                if(str.charAt(j) == 'W')
                    map[i][j] = true;
                else
                    map[i][j] = false;
            }
        }

        int row = n-7;
        int col = m-7;

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }
}
