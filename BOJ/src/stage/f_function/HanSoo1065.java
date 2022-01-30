package stage.f_function;

/*
    문제 15596번 : 정수 N개의 합
*/

import java.util.ArrayList;
import java.util.Scanner;

public class HanSoo1065 {

    public static int hanNum(int n){
        int hanN = n;
        ArrayList<Integer> as = new ArrayList<>();

        while(n>0){
            as.add(n%10);
            n /= 10;
        }

        for(int i=0; i<as.size()-2; i++){
            if(as.get(i+1)-as.get(i) != as.get(i+2)-as.get(i+1)){
                hanN = 0;
                break;
            }
        }

        return hanN;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        if(n<100){
            System.out.println(n);
        }
        else{
            int[] arr = new int[n+1];
            int answer = 99;

            for(int i=100; i<n+1; i++){
                arr[hanNum(i)]++;
            }

            for(int i=100; i<n+1; i++){
                if(arr[i]>0)
                  answer++;
            }
            System.out.println(answer);
        }
    }
}
