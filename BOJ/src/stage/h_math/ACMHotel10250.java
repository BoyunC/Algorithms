package stage.h_math;

import java.util.Scanner;

public class ACMHotel10250 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int height = kb.nextInt();
        int width = kb.nextInt();
        int nth = kb.nextInt();

        int floor = nth % height;
        int room = nth/height;

        if(floor == 0)
            System.out.println(height*100+room);
        else
            System.out.println(floor*100+room+1);
    }
}
