package stage.j_brute_force;

/*
     문제 2798번 : 블랙잭
*/

import java.util.Scanner;

public class BlackJack2798 {
    static int[] combi = new int[3];
    static int[] check;
    static int[] cards;
    static int max = Integer.MIN_VALUE;
    static int n, m, sum=0;

    public static void DFS(int L) {

        if(L==3) {
            sum = 0;
            for(int x : combi){
                sum += x;
            }
            if(sum>max && sum <= m){
                max = sum;
            }
        } else {
            for(int i=0; i<n; i++) {
                if(check[i]==0) {
                    check[i]=1;
                    combi[L] = cards[i];
                    DFS(L+1);
                    check[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        cards = new int[n];
        check = new int[n];

        for(int i=0; i<n; i++)
            cards[i] = kb.nextInt();

        DFS(0);

        System.out.println(max);
    }
}
