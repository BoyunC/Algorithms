package kit.stack_queue;

/*
    문제 : 주식 가격 (Stack/Queue Lv.2)
    solution 메소드가 문제에 대한 풀이이며,
    main 매소드는 테스트를 위해 임의대로 코드를 짜놓았기 때문에 무시하셔도 됩니다.
*/

import java.util.Scanner;
import java.util.Stack;

public class Stock {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        Stock Test = new Stock();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] prices = new int[n];

        for(int i=0; i<n; i++) {
            prices[i] = kb.nextInt();
        }

        for(int x: Test.solution(prices)) {
            System.out.print(x + " ");
        }
    }
}
