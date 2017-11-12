package Java_3_Collections;

import java.util.*;
import java.io.*;

public class SGU_2036 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        List<String> str = new ArrayList<String>();

        for (int i = 0; i < num; i++) {
            String s = in.next();
            int size = s.length();
            int ok = 0;
            for (int j = 0; j < size; j++) {
                if("eyuioa".indexOf(s.charAt(j)) != -1)
                    ++ok;
                else
                    ok = 0;
                }
            if (ok >= 3)
                str.add(s);
        }
        for (String elem : str)
            System.out.println(elem);
    }
}

