package Practice.Exercises;

import java.util.Hashtable;

public class Chapter08 {
    public static void main(String[] args) {

        String[] arr1 = {"a", "b", "c", "d", "e", "f"};
        String[] arr2 = {"b", "d", "f"};

        System.out.println("Brute Force " + isSubsetArray(arr1, arr2));
        System.out.println("HashTable: " + isSubsetArray2(arr1, arr2));

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
            if (isFound == false) {
                return false;
            }
        }
        return true;
    }


}
