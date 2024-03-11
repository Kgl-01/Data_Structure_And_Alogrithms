package Practice.Algorithm.SortingAlgo;

import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3};
//        bubbleSortOne(numbers);
        bubbleSortTwo(numbers);
        System.out.println(Arrays.toString(numbers));

    }


    /*Approach One. Time Complexity O(N^2)*/
    public static void bubbleSortOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    /*Approach two. Time Complexity O(N^2)*/
    public static void bubbleSortTwo(int[] arr) {
        int unsortedUntilIndex = arr.length - 1;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < unsortedUntilIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
            unsortedUntilIndex--;
        }
    }
}
