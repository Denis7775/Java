package Java_3_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class SGU_2035 {

    public static int[] getCycle(int[] array) {
        for (int i = 1; i < array.length / 2 + 1; i++) {
            if (array.length % i != 0) {
                continue;
            }
            int[] sub = Arrays.copyOfRange(array, 0, i);
            if (check(array, sub)) {
                return sub;
            }
        }
        return array;
    }

    private static boolean check(int[] array, int[] sub) {
        for (int k = 1; k < array.length / sub.length; k++) {
            if (!isSimilar(sub, Arrays.copyOfRange(array, k * sub.length,
                    (k + 1) * sub.length))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSimilar(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        int[] nums = new int[count];

        for (int i = 0; i < count; i++){
            nums[i] = in.nextInt();
        }

        int[] r = getCycle(nums);
        System.out.println(r.length);
    }
}
