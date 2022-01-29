package stage.f_function;

/*
    문제 4673번 : 셀프 넘버
*/

public class SelfNumber4673  {

    public  static int selfNum(int n) {
        int selfN = n;

        while(n>0){
            selfN += n%10;
            n /= 10;
        }

        return selfN;
    }

    public static void main(String[] args) {
        int[] totalArr = new int[10001];
        int count = 1;

        while(count<10001){

            if(selfNum(count)<10001)
                totalArr[selfNum(count)]++;

            count++;
        }

        for(int i=1; i<10001; i++){
            if(totalArr[i]==0)
                System.out.println(i);
        }
    }
}
