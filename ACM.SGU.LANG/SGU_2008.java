package Java_3_Collections;

import java.util.*;

public class SGU_2008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int weg = in.nextInt();
        int elem;
        int c_e =0;
        int sum = 0;

        for (int i = 0; i < count ; i++) {
            elem = in.nextInt();
            if ((sum + elem) > weg)
                continue;
            else {
                sum += elem;
                ++c_e;
            }
        }
        System.out.println(c_e + " " + sum);
    }
}
