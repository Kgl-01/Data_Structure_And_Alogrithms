package Exercises;

import java.util.Arrays;

public class Partitioning {
    public static void main(String[] args) {
        int [] arr = {0,5,2,1,6,3};
        partitioning(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

        quickSorting(arr,0,arr.length-1);
        System.out.println("2nd"+Arrays.toString(arr));
    }


    static void quickSorting(int [] arr ,int leftIndex,int rightIndex){
        /** Base Case */
        if(rightIndex-leftIndex <=0){
            return;
        }

        int pivotIndex = partitioning(arr,leftIndex,rightIndex);

        quickSorting(arr, leftIndex,pivotIndex-1);

        quickSorting(arr,pivotIndex+1,rightIndex);
    }


    static int partitioning(int [] arr, int leftPointer ,int rightPointer){
        int pivotIndex=rightPointer;
        int pivot = arr[pivotIndex];

        rightPointer-=1;


        while(true){
            while(arr[leftPointer] < pivot){
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
