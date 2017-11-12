package Java_3_Collections;

import java.util.*;

public class SGU_2006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sm = in.nextInt();
        int inch = sm/3;

        if (sm % 3 > 1){
            inch += 1;
        }
        int foot = inch / 12;
        System.out.println(foot + " " + inch % 12);
    }
}