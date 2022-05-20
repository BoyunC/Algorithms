package stage.r_divide_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomialCoefficient11401 {
    final static long P = 1000000007;

    public static long factorial(long N) {
        long fac = 1L;

        while(N > 1) {
            fac = (fac * N) % P;
            N--;
        }
        return fac;
    }

    public static long pow(long base, long expo) {

        if(expo == 1) {
            return base % P;
        }

        long tmp = pow(base, expo / 2);

        if(expo % 2 == 1) {
            return (tmp * tmp % P) * base % P;
        }
        return tmp * tmp % P;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");

        long N = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long numer = factorial(N);
        long denom = factorial(K) * factorial(N - K) % P;

        System.out.println(numer * pow(denom, P - 2) % P);

    }

}
