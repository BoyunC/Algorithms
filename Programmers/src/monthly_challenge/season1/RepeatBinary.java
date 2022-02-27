package monthly_challenge.season1;

/*
    프로그래머스 월간 코드 챌린지 시즌 1
    문제 : 이진 변환 반복하기
    레벨 : 2
*/

import java.util.ArrayList;

public class RepeatBinary {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(!s.equals("1")) {
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '0') {
                    answer[1]++;
                }
            }
            s = s.replaceAll("0", "");

            s = Integer.toBinaryString(s.length());

            answer[0]++;

        }
        return answer;
    }

    public static void main(String[] args) {
        RepeatBinary T = new RepeatBinary();

        String s = "110010101001";


        for(int x : T.solution(s))
            System.out.print(x+ " ");
    }
}
