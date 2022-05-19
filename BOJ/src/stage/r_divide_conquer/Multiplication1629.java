package stage.r_divide_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Multiplication1629 {

    public static long mul(long A, long B, long C) {

        //지수가 1일때
        if(B == 1){
            return A % C;
        }

        long tmp = mul(A, B/2, C);

        if (B % 2 == 1) {
            return (tmp * tmp % C) * A % C;
        }

        return tmp * tmp % C;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        StringTokenizer st = new StringTokenizer(kb.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(mul(A, B, C));
    }
}
