package stage.l_backtracking;

/*
     문제 148888번 : 연산자 끼워넣기
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Operator14888 {

    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    public static int[] operator = new int[4];
    public static int[] numbers;
    public static int n;

    public static void dfs(int num, int index){
        if(index == n) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for(int i=0; i<4; i++) {
            if(operator[i] > 0) {
                operator[i]--;

                if(i==0)
                    dfs(num+numbers[index], index+1);
                else if(i==1)
                    dfs(num-numbers[index], index+1);
                else if(i==2)
                    dfs(num*numbers[index], index+1);
                else if(i==3)
                    dfs(num/numbers[index], index+1);
            }

            operator[i]++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(kb.readLine());
        numbers = new int[n];

        StringTokenizer st = new StringTokenizer(kb.readLine(), " ");
        for(int i=0; i<n; i++)
            numbers[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(kb.readLine(), " ");
        for(int i=0; i<4; i++)
            operator[i] = Integer.parseInt(st.nextToken());

        dfs(numbers[0], 1 );

        System.out.println(MAX);
        System.out.println(MIN);
    }
}
