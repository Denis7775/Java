package Java_3_Collections;

import java.util.*;

public class SGU_2007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int i = 0;

        while (count % 2 != 1){
            count = count/2;
            i++;
        }
        System.out.println(i);
    }
}
