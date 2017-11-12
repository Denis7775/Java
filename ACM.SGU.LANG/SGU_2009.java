package Java_3_Collections;

import java.util.*;

public class SGU_2009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int sum = 0;
        int k;


        for (int i = 1; i <= count; i++) {
            k = 1;
            int num = in.nextInt();
            for (int j = 1; j < i; j++)
                k *= 2;
            if (i == 1)
                sum += num;
            else
                if(k % i == 0)
                    sum += num;
        }
        System.out.println(sum);
    }
}