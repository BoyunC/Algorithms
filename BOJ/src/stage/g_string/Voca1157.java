package stage.g_string;

/*
     문제 1157번 : 단어 공부
*/

import java.util.Scanner;

public class Voca1157 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        int answer = 0;


        int[] arr = new int[26];

        String voca = kb.next().toUpperCase();

        for(int i=0; i<voca.length(); i++) {
            arr[voca.charAt(i)-'A'] ++;
        }

        for(int i=0; i<26; i++) {
            if(max < arr[i]){
                max = arr[i];
                answer = i;
            }

        }

        for(int i=0; i<26; i++) {
            if(max == arr[i])
                cnt++;
        }

        if(cnt>1)
            System.out.println("?");
        else
            System.out.println((char)(answer+'A'));



//        Scanner kb = new Scanner(System.in);
//        HashMap<String, Integer> map = new HashMap<>();
//        int max = Integer.MIN_VALUE;
//        int cnt = 0;
//        String answer="";
//
//        String voca = kb.next();
//
//        voca = voca.toUpperCase();
//
//        for(int i=0; i<voca.length(); i++){
//            map.put(String.valueOf(voca.charAt(i)),
//                    map.getOrDefault(String.valueOf(voca.charAt(i)), 0)+1);
//        }
//
//
//        for(String x : map.keySet()){
//            if(map.get(x) > max) {
//                max = map.get(x);
//                answer = x;
//            }
//        }
//
//        for(String x : map.keySet()){
//            if(map.get(x) == max) {
//                cnt++;
//            }
//        }
//
//        if(cnt >1)
//            System.out.println("?");
//        else
//            System.out.println(answer);
    }
}
