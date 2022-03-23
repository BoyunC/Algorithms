package stage.k_sort;

/*
     문제 18870번 : 좌표 압축
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CordinateCompress18870 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] origin = new int[n];
        int[] sorted = new int[n];

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            sorted[i] = origin[i] = kb.nextInt();
        }

        Arrays.sort(sorted);

        int rank = 0;

        for(int v : sorted) {
            if(!hashMap.containsKey(v)) {
                hashMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int key : origin) {
            int ranking = hashMap.get(key);
            sb.append(ranking + " ");
        }

        System.out.println(sb);

    }
}
