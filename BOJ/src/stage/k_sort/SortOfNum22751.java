package stage.k_sort;

/*
     문제 2751번 : 수 정렬하기 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortOfNum22751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0; i<n; i++) {
            arr.add(Integer.parseInt(bufferedReader.readLine()));
        }

        Collections.sort(arr);

        for(int i=0; i<n; i++)
            bufferedWriter.write(arr.get(i)+"\n");

        bufferedWriter.close();

    }
}
