package Java_3_Collections;

import java.util.*;

public class SGU_2005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int elem;
        int j = 0;
        int time = 0;

        for (int i = 1 ; i <= count ; i++) {
            elem = in.nextInt();
            if (i == 1)
                time = elem;
            else if (i != 1) {
                if (elem < time) {
                    time = elem;
                    j = i;
                }
            }
        }
        System.out.println(j);
    }
}
