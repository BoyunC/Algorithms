package stage.c_for;

import java.util.ArrayList;
import java.util.Scanner;

public class LessThanX10871 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> answer = new ArrayList();

        int n = kb.nextInt();
        int[] arr = new int[n];

        int x = kb.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i]<x)
                answer.add(arr[i]);
        }

        for(int i :answer)
            System.out.print(i + " ");
    }
}
