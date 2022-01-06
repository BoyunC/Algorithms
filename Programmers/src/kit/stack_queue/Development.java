package kit.stack_queue;

/*
    문제 : 기능개발 (Stack/Queue Lv.2)
    solution 메소드가 문제에 대한 풀이이며,
    main 매소드는 테스트를 위해 임의대로 코드를 짜놓았기 때문에 무시하셔도 됩니다.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Development {

    public ArrayList<Integer> solution(int[] progresses, int[] speeds){

        ArrayList<Integer> answer = new ArrayList<>();
        int[] days = new int[progresses.length];

        for(int i=0; i<progresses.length; i++) {
            double tmp = (100 - progresses[i]) / (double) speeds[i];
            days[i] = (int) Math.ceil(tmp);
        }

        int max = days[0];
        int cnt = 1;

        for(int i=1; i< days.length; i++){
            if(days[i]>max){
                max = days[i];
                answer.add(cnt);
                cnt = 1;
            } else {
                cnt ++;
            }

            if(i == days.length-1) {
                answer.add(cnt);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Development Test = new Development();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] progresses = new int[n];
        int[] speeds = new int[n];

        for(int i=0; i<n; i++) {
            progresses[i] = kb.nextInt();
        }

        for(int i=0; i<n; i++) {
            speeds[i] = kb.nextInt();
        }

        System.out.println(Test.solution(progresses, speeds));
    }
}