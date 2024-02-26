package Exercises;

import java.util.Arrays;

public class HasDuplicates {
    public static void main(String[] args) {
        int [] arr = {9,3,2,4,5,6};

        System.out.println(hasDupicates(arr));
    }


    /**Time complexity O(NlogN)*/
    static boolean hasDupicates(int [] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1 ; i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }

        return false;
    }
}
