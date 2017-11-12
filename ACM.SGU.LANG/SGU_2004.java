package Java_3_Collections;

import java.util.*;

public class SGU_2004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        if (((count % 4 == 0) && (count % 100 != 0)) || (count % 400 == 0))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
