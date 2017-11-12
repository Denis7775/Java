package Java_3_Collections;

import java.util.*;

public class SGU_2025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        List<Integer> ints = new ArrayList<>();

        for (int i = 0; i < count; i++)
            ints.add(in.nextInt());

        int numOfqueries = in.nextInt();
        for (int i = 0; i < numOfqueries; i++) {
            int left = in.nextInt();
            int right = in.nextInt();
            int min = ints.get(left - 1);
            for (int j = left; j < right; j++)
                if (min > ints.get(j))
                    min = ints.get(j);
            System.out.println(min);
        }
    }
}
