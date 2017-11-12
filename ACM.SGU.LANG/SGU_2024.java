package Java_3_Collections;

import java.util.*;

public class SGU_2024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;

        int count = in.nextInt();
        List<Integer> ints = new ArrayList<>();

        for (int i = 0; i < count; i++)
            ints.add(in.nextInt());

        for (int i = 0; i < count/2; i++) {
                if (!Objects.equals(ints.get(i),(ints.get(count - i - 1))))
                    ++counter;
        }
        System.out.println(counter);
    }
}
