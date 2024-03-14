package Practice.Exercises;

import java.util.ArrayList;
import java.util.List;

public class Chapter06 {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 2, 5};
        int[] arr2 = {4, 5, 3, 6, 4, 9, 9, 9, 5};

        System.out.println(intersection(arr1, arr2));

        System.out.println(twoSum(arr1));
    }


    /*Time Complexity O(N)*/
    public static boolean containsX(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X' || str.charAt(i) == 'x') {
                return true;
            }
        }
        return false;
    }


    /**
     * Time Complexity:
     * Best Case Scenario - O(N)
     * Worst Case Scenario - O(N^2)
     */
    public static boolean twoSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] + arr[j]) == 10) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * Time Complexity :
     * Both arrays are of same size - O(N^2)
     * Arrays of different sizes - O(N*M)
     */
    public static List intersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (!list.contains(arr1[i])) {
                        list.add(arr1[i]);
                    }
                    break;
                }
            }
        }

        return list;
    }
}
