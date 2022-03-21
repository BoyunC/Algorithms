package stage.k_sort;

/*
     문제 1181번 : 단어 정렬
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortOfVoca1181 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();
        int n = kb.nextInt();
        String input = "";

        for(int i=0; i<n; i++){
            input = kb.next();
            if(!arr.contains(input))
                arr.add(input);
        }

        arr.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                else
                    return o1.length()-o2.length();
            }
        });

        for(String x: arr)
            System.out.println(x);
    }
}
