package monthly_challenge.season1;

/*
    프로그래머스 월간 코드 챌린지 시즌 1
    문제 : 내적
    레벨 : 1
*/

public class DotProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++) {
            answer += (a[i] * b[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        DotProduct T = new DotProduct();

        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        System.out.println(T.solution(a, b));
    }
}
