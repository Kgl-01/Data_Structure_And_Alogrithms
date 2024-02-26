package Algorithm.SortingAlgorithm;

import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args) {
        int [] arr = {7,6,5,3,2,1,4};
//        quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        System.out.println(quickSelect(arr,1, 0,arr.length-1));
    }



    /** Quick Select algo is a combination of partitioning and hybrid between quick sort and
     binary search . Time Complexity of the algorithm is O(N) */
    static int quickSelect(int [] arr,int kthLowestValue, int leftIndex , int rightIndex){
        if (rightIndex - leftIndex <= 0) {
            return arr[leftIndex];
        }

        int pivotIndex = partitioning(arr,leftIndex, rightIndex);

        if (kthLowestValue < pivotIndex) {
            return quickSelect(arr,kthLowestValue, leftIndex, pivotIndex - 1);
        } else if (kthLowestValue > pivotIndex) {
            return quickSelect(arr,kthLowestValue, pivotIndex + 1, rightIndex);
        } else {
            return arr[pivotIndex];
        }
    }

    static void quickSort(int [] arr, int leftIndex,int rightIndex){

        if(rightIndex-leftIndex<=0){
            System.out.println("Exit");
            return;
        }

        int pivotIndex = partitioning(arr,leftIndex,rightIndex);

        quickSort(arr,leftIndex,pivotIndex-1);
        quickSort(arr,pivotIndex+1,rightIndex);

    }

    static int partitioning(int [] arr,int leftPointer,int rightPointer){
        int pivotIndex=rightPointer;
        int pivot= arr[pivotIndex];

        rightPointer--;

        while(true){
            while(arr[leftPointer]<pivot){
                leftPointer++;
            }

            while(arr[rightPointer]>pivot){
                rightPointer--;
            }

            if(leftPointer>=rightPointer){
                break;
            }else{
                int temp = arr[leftPointer];
                arr[leftPointer]=arr[rightPointer];
                arr[rightPointer]=temp;
                leftPointer++;
            }

        }

        int temp = arr[leftPointer];
        arr[leftPointer]=arr[pivotIndex];
        arr[pivotIndex]=temp;

        return leftPointer;
    }
}
