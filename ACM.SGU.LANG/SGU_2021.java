package Java_3_Collections;

import java.util.*;

public class SGU_2021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        List<Integer> ints = new ArrayList<Integer>();

        for(int i = 0; i < count; i++)
            ints.add(in.nextInt());

        for (int i = 0; i < 2; i++){
            Integer max = Collections.max(ints);
            for (int j = 0; j < ints.size(); j++){
                Integer a = ints.get(j);
                if(a.equals(max)) {
                    a /= 2;
                    ints.set(j, a);
                }
            }
        }
        String s = "";
        for (int j = 0; j < count -1; j++)
            s += ints.get(j) + " ";
        s += ints.get(count-1);
        System.out.println(s);
}
}