package Java_3_Collections;

import java.util.*;

public class SGU_2023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> ints = new ArrayList<>();

        int count = in.nextInt();
        for (int i = 0; i < count; i++){
            ints.add(in.nextInt());
        }

        Set<Integer> set = new HashSet<>();

        int num = in.nextInt();
        for (int i = 0; i < num; i++)
            set.add(in.nextInt());

        List<Integer> fin = new ArrayList<>();
        for (int i = 0; i < count; i++){
            if (set.contains(ints.get(i)))
                fin.add(ints.get(i));
        }

        int size = fin.size();
        if (size == 0) {
            System.out.println(size);
        }
        else
            System.out.println(size);

        for (int i = 0; i < size; i++)
            System.out.print(fin.get(i) + " ");
    }
}
