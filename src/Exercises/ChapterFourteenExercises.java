package Exercises;

import java.util.Arrays;

public class ChapterFourteenExercises {
    public static void main(String[] args) {
        int [] arr = {9,3,2,4,5,6};

        System.out.println(greatestProductOfThreeNumbers(arr));

        int []numbers = {9,3,2,5,6,7,1,0,4};
        System.out.println(findMissingNumber(numbers));

    }



    static int findMissingNumber(int [] arr){
        Arrays.sort(arr);

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return -1;
    }


    /**Time complexity of O(NlogN)*/
    static int greatestProductOfThreeNumbers(int [] arr){
        Arrays.sort(arr);
        return arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
    }

}
