package kit.stack_queue;

/*
    문제 : 프린터 (Stack/Queue Lv.2)
    solution 메소드가 문제에 대한 풀이이며,
    main 매소드는 테스트를 위해 임의대로 코드를 짜놓았기 때문에 무시하셔도 됩니다.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CrossingBridge {

    class Truck{
        int time;
        int weight;
        public Truck (int time, int weight) {
            this.time = time;
            this.weight = weight;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int sum = 0;

        Queue<Truck> crossing = new LinkedList<>();  // 다리를 건너는 트럭을 담는 큐
        Queue<Integer> ready = new LinkedList<>();   // 대기하는 트럭을 담는 큐

        for(int i=0; i<truck_weights.length; i++) ready.offer(truck_weights[i]);

        crossing.offer(new Truck(1, ready.poll()));


        while(!crossing.isEmpty()) {
            answer ++;
            sum = 0;

            if(crossing.peek().time == bridge_length) crossing.poll(); // 트럭이 다리를 다 건넜는지 확인

            for(Truck t : crossing) t.time += 1; // + 1초

            if(!ready.isEmpty()) {

                for(Truck t : crossing) sum += t.weight;

                if(sum + ready.peek() <= weight) {
                    crossing.offer(new Truck(1, ready.poll()));
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CrossingBridge Test = new CrossingBridge();
        Scanner kb = new Scanner(System.in);

        int bridge_length = kb.nextInt();

        int weight = kb.nextInt();

        int n = kb.nextInt();
        int[] truck_weights = new int[n];

        for(int i=0; i<n; i++) {
            truck_weights[i] = kb.nextInt();
        }

        System.out.println(Test.solution(bridge_length, weight, truck_weights));
    }
}