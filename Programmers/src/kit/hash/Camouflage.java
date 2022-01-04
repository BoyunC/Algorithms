package kit.hash;

/*
    문제 : 위장 (Hash Lv.2)
    solution 메소드가 문제에 대한 풀이이며,
    main 매소드는 테스트를 위해 임의대로 코드를 짜놓았기 때문에 무시하셔도 됩니다.
*/

import java.util.HashMap;
import java.util.Scanner;

public class Camouflage {

    public Integer solution(String[][] clothes){
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }

        for(String key : map.keySet()){
            answer *= map.get(key)+1;
        }

        answer -= 1;

        return answer;
    }

    public static void main(String[] args) {
        Camouflage Test = new Camouflage();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String[][] clothes = new String[n][2];

        for(int i=0; i<n; i++) {
            for(int j=0; j<2; j++) {
                clothes[i][j] = kb.next();
            }
        }

        System.out.println(Test.solution(clothes));
    }
}