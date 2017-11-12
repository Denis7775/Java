package Java_3_Collections;

import java.util.*;
import java.io.*;

public class SGU_2003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int sum = 0;
        for (int i = 0; i < count ; i++) {
            if (i % 2 == 0)
                sum += in.nextInt();
            else
                sum -= in.nextInt();
        }
        System.out.println(sum);
    }
}