package Exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ChapterFourteenExercises {
    public static void main(String[] args) {
        int [] arr = {9,3,2,4,5,6};

        System.out.println(greatestProductOfThreeNumbers(arr));

        int []numbers = {9,3,2,5,6,7,1,0,4};
        System.out.println(findMissingNumber(numbers));

        int [] repeats ={3,1,3,3,2};

        System.out.println(majorityElement(repeats,repeats.length));

    }

    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<size ; i++){
            if(map.get(a[i])!=null){

                    map.put(a[i],(map.get(a[i])+1));

            }else{
                map.put(a[i],1);
            }
        }

       for(int i : a){
           if(map.get(i)>(size/2)){
               return i;
           }
       }

        return -1;
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
