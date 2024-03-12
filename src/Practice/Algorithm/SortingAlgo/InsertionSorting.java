package Practice.Algorithm.SortingAlgo;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3};
        insertionSorting(numbers);
        System.out.println(Arrays.toString(numbers));
    }


    /*Time Complexity O(N^2)*/
    public static void insertionSorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tempValue = arr[i];
            int position;
            for (position = i - 1; position >= 0; position--) {
                if (arr[position] > tempValue) {
                    arr[position + 1] = arr[position];
                } else {
                    break;
                }
            }
            arr[position + 1] = tempValue;
        }
    }
}
