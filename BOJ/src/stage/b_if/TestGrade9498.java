package stage.b_if;

/*
    문제 9498번 : 시험 성적
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestGrade9498 {

    public static void main(String[] args) throws IOException {
        // case1. Scanner 이용
        Scanner kb = new Scanner(System.in);

        int score = kb.nextInt();
        char grade = 'F';

        if(score>=90)
            grade = 'A';
        else if (score>=80)
            grade = 'B';
        else if (score>=70)
            grade = 'C';
        else if (score>=60)
            grade = 'D';

        System.out.println(grade);

        //case2. BufferedReader 이용
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        int score = Integer.parseInt(bf.readLine());
//        char grade = 'F';
//
//        if(score>=90)
//            grade = 'A';
//        else if (score>=80)
//            grade = 'B';
//        else if (score>=70)
//            grade = 'C';
//        else if (score>=60)
//            grade = 'D';
//
//        System.out.println(grade);
    }
}
