package monthly_challenge.season1;

/*
    프로그래머스 월간 코드 챌린지 시즌 1
    문제 : 3진법 뒤집기
    레벨 : 1
*/

import java.util.ArrayList;

public class Reverse {

    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> tenary = new ArrayList<>();

        while(n!=0) {
            tenary.add(n%3);
            n /= 3;
        }

        n=1;

        for(int i=tenary.size()-1; i>=0; i--){
            answer += ( tenary.get(i) * n);
            n *= 3;
        }

        return answer;
    }

    public static void main(String[] args) {
        Reverse T = new Reverse();

        int n = 45;

        System.out.println(T.solution(n));
    }
}
