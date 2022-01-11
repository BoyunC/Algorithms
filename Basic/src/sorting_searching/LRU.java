package sorting_searching;


import java.util.Scanner;

public class LRU {

    // size : 주기억장치 사이즈
    // n 	: 입력된 페이지 수
    // arr 	: 페이지 번호 배열

    public int[] solution(int size, int n, int[] arr) {

        int[] answer = new int[size]; // 주기억장치

        for(int x: arr) {

            int pos = -1;

            for(int i=0; i<size; i++) {

                if(x == answer[i])
                    pos = i;		// 주기억장치에 페이지 존재하는지 여부 확인

            }

            if(pos==-1) {		// 주기억장치에 페이지가 존재하지 않는 경우

                for(int i=size-1; i>=1; i--) {
                    answer[i] = answer[i-1]; // 모든 페이지를 한 칸씩 뒤로 이동
                }

            } else {			// 주기억장치에 페이지가 존재하는 경우

                for(int i=pos; i>=1; i--) {
                    answer[i] = answer[i-1]; // 인덱스 0부터 해당 인덱스까지 한 칸씩 뒤로 이동
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LRU lru = new LRU();
        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();
        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = kb.nextInt();

        System.out.println(lru.solution(size, n, arr));
    }
}