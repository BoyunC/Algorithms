package kit.hash;

/*
    문제 : 전화번호 목록 (Hash Lv.2)
    solution 메소드가 문제에 대한 풀이이며,
    main 매소드는 테스트를 위해 임의대로 코드를 짜놓았기 때문에 무시하셔도 됩니다.
*/

import java.util.HashMap;
import java.util.Scanner;

public class PhoneNumberList {

    public boolean solution(String[] phone_book){
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();

        for(String key: phone_book) {
             map.put(key, key.length());
        }

        for(int i=0; i<phone_book.length; i++) {
            for(int j=0; j<phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PhoneNumberList Test = new PhoneNumberList();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String[] phone_book = new String[n];

        for(int i=0; i<n; i++)
            phone_book[i] = kb.next();

        System.out.println(Test.solution(phone_book));
    }
}