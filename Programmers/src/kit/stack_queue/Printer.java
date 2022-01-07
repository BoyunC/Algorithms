package kit.stack_queue;

/*
    문제 : 프린터 (Stack/Queue Lv.2)
    solution 메소드가 문제에 대한 풀이이며,
    main 매소드는 테스트를 위해 임의대로 코드를 짜놓았기 때문에 무시하셔도 됩니다.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Printer {

    class Print{
        int id;
        int priority;
        public Print(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location){
        int answer = 0;

        Queue<Print> Q = new LinkedList<>();

        for(int i=0; i<priorities.length; i++) Q.offer(new Print(i, priorities[i]));

        while(!Q.isEmpty()) {
            Print tmp = Q.poll();
            for (Print p : Q) {
                if (p.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if (tmp != null) {
                answer++;
                if (tmp.id == location) return answer;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Printer Test = new Printer();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] priorities = new int[n];

        for(int i=0; i<n; i++) {
            priorities[i] = kb.nextInt();
        }

        int location = kb.nextInt();

        System.out.println(Test.solution(priorities, location));
    }
}