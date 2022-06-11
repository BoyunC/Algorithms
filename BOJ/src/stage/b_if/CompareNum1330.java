package stage.b_if;

/*
    문제 1330번 : 두 수 비교하기
*/

import java.io.IOException;
import java.util.Scanner;

public class CompareNum1330 {

    public static void main(String[] args) throws IOException {
        //case 1. Scanner 이용 + if 문
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        int b = kb.nextInt();

        if(a>b)
            System.out.println(">");
        else if(a<b)
            System.out.println("<");
        else
            System.out.println("==");

        //case 2. BufferedReader + StringTokenizer 이용 + 삼항연산자

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
//
//        int a = Integer.parseInt(stringTokenizer.nextToken());
//        int b = Integer.parseInt(stringTokenizer.nextToken());
//
//        System.out.println((a>b) ? ">" : (a<b) ? "<" : "==");

    }
}
