package monthly_challenge.season1;

/*
    프로그래머스 월간 코드 챌린지 시즌 1
    문제 : 두 개 뽑아서 더하기
    레벨 : 1
*/

import java.util.ArrayList;
import java.util.Comparator;

public class PickAndSum {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=1+i; j<numbers.length; j++) {
                System.out.println(i + " " + j + ", "
                        + numbers[i] + " " + numbers[j] + " " + (numbers[i] + numbers[j]) );
                if(!answer.contains(numbers[i] + numbers[j]))
                    answer.add(numbers[i] + numbers[j]);
            }
        }

        answer.sort(Comparator.naturalOrder());

        return answer;
    }

    public static void main(String[] args) {
        PickAndSum T = new PickAndSum();

        int[] numbers = {2,1,3,4,1};

        System.out.println(T.solution(numbers));
    }
}
