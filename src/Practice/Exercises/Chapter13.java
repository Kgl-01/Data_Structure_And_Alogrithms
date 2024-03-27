package Practice.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter13 {
    public static void main(String[] args) {

        int[] numbers = {7, 5, 4, 3, 2, 1, 0};
        System.out.println(maxProductOfThreeBF(numbers));
        System.out.println(maxProductOfThree(numbers));
        System.out.println(findMissingNumber(numbers));
        System.out.println(findMissingNumberOp(numbers));
        System.out.println(findGreatestNumber(numbers));
    }


    /*Time Complexity O(NlogN)*/
    public static int findGreatestNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }


    /*Time complexity O(NlogN)*/
    public static int findMissingNumberOp(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return -1;
    }

    /*Time Complexity O(N^2)*/
    public static int findMissingNumber(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }

        for (int i = 0; i <= list.size(); i++) {
            if (!list.contains(i)) {
                return i;
            }
        }

        return -1;
    }


    /*Time Complexity O(NlogN) */
    public static int maxProductOfThree(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length - 1;

        return arr[n] * arr[n - 1] * arr[n - 2];
    }


    /* Brute Force approach. Time Complexity O(N^3)*/
    public static int maxProductOfThreeBF(int[] arr) {
        int product = 1;
        int n = arr.length - 1;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] * arr[j] * arr[k] > product) {
                        product = arr[i] * arr[j] * arr[k];
                    }
                }
            }
        }
        return product;
    }

    public static int partitioning(int[] arr, int leftPointer, int rightPointer) {
        int pivotIndex = rightPointer;
        int pivot = arr[pivotIndex];

        rightPointer -= 1;

        while (true) {
            while (arr[leftPointer] < pivot) {
                leftPointer++;
            }

            while (arr[rightPointer] > pivot) {
                rightPointer--;
            }

            if (leftPointer >= rightPointer) {
                break;
            } else {
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;
                leftPointer++;
            }
        }

        int temp = arr[leftPointer];
        arr[leftPointer] = pivot;
        arr[pivotIndex] = temp;

        return leftPointer;
    }

}
