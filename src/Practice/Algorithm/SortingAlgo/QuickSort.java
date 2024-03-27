package Practice.Algorithm.SortingAlgo;


import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 3, 2, 1, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    /*Time Complexity O(N)*/
    public static int quickSelect(int[] arr, int kthValue, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex <= 0) {
            return arr[leftIndex];
        }

        int pivotIndex = partitioning(arr, leftIndex, rightIndex);

        if (kthValue < pivotIndex) {
            return quickSelect(arr, kthValue, leftIndex, pivotIndex - 1);
        } else if (kthValue > pivotIndex) {
            return quickSelect(arr, kthValue, pivotIndex + 1, rightIndex);
        } else {
            return arr[pivotIndex];
        }
    }


    /**
     * Time Complexity
     * -Best Case : O(NlogN)
     * -Average case : O(NlogN)
     * -Worst Case : O(N^2)
     */
    public static void quickSort(int[] arr, int leftPointer, int rightPointer) {
        if (rightPointer - leftPointer <= 0) {
            return;
        }

        int pivotIndex = partitioning(arr, leftPointer, rightPointer);

        quickSort(arr, leftPointer, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, rightPointer);
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
        arr[leftPointer] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        return leftPointer;
    }
}
