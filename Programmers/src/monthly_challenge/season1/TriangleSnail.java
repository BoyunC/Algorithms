package monthly_challenge.season1;

/*
    프로그래머스 월간 코드 챌린지 시즌 1
    문제 : 삼각 달팽이
    레벨 : 2
*/

import java.util.ArrayList;

public class TriangleSnail {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 1;
        int x = -1, y = 0;

        int[][] triangle = new int[n][n];

        for(int i=n; i>0; i-=3) {
            for(int j=0; j<i; j++) {
                triangle[++x][y] = cnt++;
            }

            for(int j=0; j<i-1; j++) {
                triangle[x][++y] = cnt++;
            }

            for(int j=0; j<i-2; j++) {
                triangle[--x][--y] = cnt++;
            }
        }

        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if(triangle[i][j]!=0)
                    answer.add(triangle[i][j]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        TriangleSnail  T = new TriangleSnail();

        int n = 6;

        for(int x : T.solution(n))
            System.out.print(x + " ");
    }
}
