package kit.heap;

import java.util.PriorityQueue;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int n : scoville)
            queue.offer(n);

        int answer = 0;
        while (queue.size() >= 2) {
            int a = queue.poll();
            int b = queue.poll();
            queue.offer(a + b * 2);
            answer++;

            if (queue.peek() >= K)
                return answer;
        }

        return -1;
    }

    public static void main(String[] args) {
        MoreSpicy T = new MoreSpicy();

        int[] scovile = {1, 2, 3, 9, 10, 12};
        int k = 7;

        System.out.println(T.solution(scovile, k));
    }
}
