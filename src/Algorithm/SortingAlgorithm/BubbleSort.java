package Algorithm.SortingAlgorithm;

import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] ={65,55,45,35,25,15};
        int [] sortedArray= bubbleSort(arr);

        for(int i : sortedArray){
            System.out.println(i);
        }

    }

    static int[] bubbleSort(int [] arr){
        int unsortedUntilIndex = arr.length -1;
        boolean sorted = false;

        while(!sorted){
            sorted = true;
            for(int i=0 ; i<unsortedUntilIndex; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;

                    sorted= false;
                }
            }
            unsortedUntilIndex--;
        }
        return  arr;
    }
}
