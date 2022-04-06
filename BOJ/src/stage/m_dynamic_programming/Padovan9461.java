package stage.m_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Padovan9461 {

    public static long[] side = new long[101];

    public static long padovan(int t) {
        if(side[t] == -1)
            side[t] = padovan(t-2) + padovan(t-3);
        return side[t];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        side[0] = 0L;
        side[1] = 1L;
        side[2] = 1L;
        side[3] = 1L;

        for(int i=4; i<101; i++){
            side[i] = -1;
        }

        int t = Integer.parseInt(kb.readLine());

        while(t-->0)
            sb.append(padovan(Integer.parseInt(kb.readLine()))+"\n");

        System.out.println(sb);
    }
}
