package stage.d_while;

import java.util.Scanner;

public class SumCycle1110 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int firstNum = kb.nextInt();
        int newNum = -1;
        int answer = 1;

        if(firstNum<10){
            newNum = (firstNum*10) + firstNum;
        } else {
            newNum = ((firstNum%10) * 10) + ((firstNum/10) + (firstNum%10))%10;
        }

        while (newNum != firstNum){
            if(newNum<10){
                newNum = (newNum*10) + newNum;
            } else {
                newNum = ((newNum%10) * 10) + ((newNum/10) + (newNum%10))%10;
            }
            answer++;
        }

        System.out.println(answer);
    }
}
