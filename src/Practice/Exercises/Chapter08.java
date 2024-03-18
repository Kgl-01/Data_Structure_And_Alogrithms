package Practice.Exercises;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Chapter08 {
    public static void main(String[] args) {

        String[] arr1 = {"a", "b", "c", "d", "e", "f"};
        String[] arr2 = {"b", "d", "f"};

        System.out.println("Brute Force " + isSubsetArray(arr1, arr2));
        System.out.println("HashTable: " + isSubsetArray2(arr1, arr2));

        System.out.println("Intersection: " + isIntersecting(arr1, arr2));

    }


    public static List isIntersecting(String[] arr1, String[] arr2) {
        List<String> list = new ArrayList<>();
        Hashtable<String, Integer> table = new Hashtable<>();

        for (String i : arr1) {
            table.put(i, 1);
        }
        for (String i : arr2) {
            if (table.get(i) != null) {
                list.add(i);
            }
        }

        return list;
    }


    /*Time Complexity O(N)*/
    public static boolean isSubsetArray2(String[] arr1, String[] arr2) {
        Hashtable<String, Boolean> table = new Hashtable<>();

        String[] largerArray;
        String[] smallerArray;

        if (arr1.length > arr2.length) {
            largerArray = arr1;
            smallerArray = arr2;
        } else {
            largerArray = arr2;
            smallerArray = arr1;
        }

        for (String str : largerArray) {
            table.put(str, true);
        }

        for (String s : smallerArray) {
            if (table.get(s) == null) {
                return false;
            }
        }
        return true;
    }


    /*Time Complexity O(N*M) */
    public static boolean isSubsetArray(String[] arr1, String[] arr2) {
        String[] largerArray;
        String[] smallerArray;

        if (arr1.length > arr2.length) {
            largerArray = arr1;
            smallerArray = arr2;
        } else {
            largerArray = arr2;
            smallerArray = arr1;
        }

        for (int i = 0; i < smallerArray.length; i++) {
            boolean isFound = false;
            for (int j = 0; j < largerArray.length; j++) {
                if (smallerArray[i].equals(largerArray[j])) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                return false;
            }
        }
        return true;
    }


}
