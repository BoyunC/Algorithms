package monthly_challenge.season1;

/*
    프로그래머스 월간 코드 챌린지 시즌 1
    문제 : 쿼드 압축 후 세기
    레벨 : 2
*/

public class QuadZip {
    int[] answer;

    public void quad(int n, int y, int x, int[][] arr) {
        if(n == 1) {
            answer[arr[y][x]]++;
            return;
        }

        if(isBlock(n, y, x, arr)) return;

        quad(n/2, y, x, arr);
        quad(n/2, y + n/2, x, arr);
        quad(n/2, y, x + n/2, arr);
        quad(n/2, y + n/2, x + n/2, arr);

    }

    public boolean isBlock(int n, int y, int x, int[][] arr) {
        for (int i = y; i < y + n; i++) {
            for (int j = x; j < x + n; j++) {
                if(arr[y][x] != arr[i][j]) return false;
            }
        }

        answer[arr[y][x]]++;
        return true;
    }

    public int[] solution(int[][] arr) {
        answer = new int[2];
        quad(arr.length, 0, 0, arr);
        return answer;
    }

    public static void main(String[] args) {
        QuadZip T = new QuadZip();

        int[][] arr = {
                {1,1,0,0},
                {1,0,0,0},
                {1,0,0,1},
                {1,1,1,1}};

        for(int x: T.solution(arr))
            System.out.println(x);
    }
}
