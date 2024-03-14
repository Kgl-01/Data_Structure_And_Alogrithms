package Practice.Algorithm.SortingAlgo;

import java.util.Arrays;

public class SelectionSorting {

    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3};
        selectionSorting(numbers);
        System.out.println(Arrays.toString(numbers));
    }


    /*Time complexity O(N^2)*/
    public static void selectionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int lowestValueIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowestValueIndex]) {
                    lowestValueIndex = j;
                }
            }
            if (lowestValueIndex != i) {
                int temp = arr[i];
                arr[i] = arr[lowestValueIndex];
                arr[lowestValueIndex] = temp;
            }
        }
    }
}
