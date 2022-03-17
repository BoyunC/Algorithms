package stage.k_sort;

/*
     문제 1427번 : 소트인사이드
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SortInside1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String str = input.readLine();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<str.length(); i++) {
            arr.add(Integer.parseInt(str.charAt(i)+""));
        }

        arr.sort(Comparator.reverseOrder());

        for(int x: arr)
            System.out.print(x);
    }
}
