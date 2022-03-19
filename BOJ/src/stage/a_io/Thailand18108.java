package stage.a_io;

/*
    문제 18108번 : 1998년생인 내가 태국에서는 2541년생?!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thailand18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(kb.readLine());

        System.out.println(year-543);
    }
}
