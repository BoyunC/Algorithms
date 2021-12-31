package kit.hash;

/*
    문제 : 완주하지 못한 선수 (Hash Lv.1)
    solution 메소드가 문제에 대한 풀이이며,
    main 매소드는 테스트를 위해 임의대로 코드를 짜놓았기 때문에 무시하셔도 됩니다.
*/

import java.util.HashMap;
import java.util.Scanner;

public class UncompletedPlayer {

    public String solution(String[] participant, String[] completion){
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<participant.length; i++)
            map.put(participant[i], map.getOrDefault(participant[i], 0)+1);

        for(int i=0; i<completion.length; i++)
            map.put(completion[i], map.get(completion[i])-1);

        for(int i=0; i<participant.length; i++){
            if(map.get(participant[i]) != 0)
                answer = participant[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        UncompletedPlayer Test = new UncompletedPlayer();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String[] participant = new String[n];

        for(int i=0; i<n; i++)
            participant[i] = kb.next();

        String[] completion = new String[n-1];

        for(int i=0; i<n-1; i++)
            completion[i] = kb.next();

        System.out.println(Test.solution(participant, completion));
    }
}
