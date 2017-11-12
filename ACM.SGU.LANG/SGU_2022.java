package Java_3_Collections;

import java.util.*;

public class SGU_2022 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int counter = 0;

        List<Integer> ints = new ArrayList<Integer>();

        for (int i = 0; i < count ; i++)
            ints.add(in.nextInt());

        for (int i = 0; i < count ; i++)
            for (int j = 0; j < count ; j++)
                if ((i != j) && (ints.get(i) % ints.get(j) == 0))
                    ++counter;
        System.out.println(counter);
    }
}
