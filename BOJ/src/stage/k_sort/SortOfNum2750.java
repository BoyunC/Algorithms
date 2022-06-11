package stage.k_sort;

/*
     문제 2750번 : 수 정렬하기
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortOfNum2750 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int a = kb.nextInt();
            if(!arr.contains(a))
                arr.add(a);
        }

        arr.sort(Comparator.naturalOrder());

        for(int x: arr)
            System.out.println(x);
    }
}
