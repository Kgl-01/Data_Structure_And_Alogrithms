package Practice.Exercises;

import java.util.ArrayList;
import java.util.List;

public class Chapter04 {
    public static void main(String[] args) {
        int[] duplicates = {5, 3, 9, 1, 4};
//        System.out.println(hasDuplicatesV1(duplicates));
        System.out.println(hasDuplicatesV2(duplicates));
        System.out.println(greatestProduct(duplicates));
        System.out.println(greatestNumber(duplicates));
    }

    public static boolean hasDuplicatesV1(int[] arr) {
        int steps = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                steps++;
                if (i != j && arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        System.out.println("Steps: " + steps);
        return false;
    }

    public static boolean hasDuplicatesV2(int[] arr) {
        int steps = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            steps++;
            if (list.contains(i)) {
                return true;
            }
            list.add(i);
        }
        System.out.println("Steps: " + steps);
        return false;
    }

    public static int greatestProduct(int[] arr) {
        int greatestProductSoFar = arr[0] * arr[1];
        for (int i : arr) {
            for (int j : arr) {
                if (i != j && i * j > greatestProductSoFar) {
                    greatestProductSoFar = i * j;
                }
            }
        }

        return greatestProductSoFar;
    }

    public static int greatestNumber(int[] arr) {
        int greatestValue = 0;

        for (int i : arr) {
            if (i > greatestValue) {
                greatestValue = i;
            }
        }
        
        return greatestValue;
    }
}
