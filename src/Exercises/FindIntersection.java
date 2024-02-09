package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindIntersection {
    public static void main(String[] args) {
    int [] arr1={1,2,3,4,5};
    int [] arr2={0,2,4,6,8};
        System.out.println(Arrays.toString(findIntersection(arr1,arr2)));
        System.out.println(findIntersectedElements(arr1,arr2));
    }


    /**Optimized version Time Complexity O(N)*/
    public static ArrayList<Integer>findIntersectedElements(int[]arr1,int[]arr2){
        ArrayList<Integer> list = new ArrayList<>();
        Map <Integer,Boolean> map = new HashMap<>();

        for(int i:arr1){
            map.put(i,true);
        }

        for(int i :arr2){
            if(map.get(i)!=null){
                list.add(i);
            }
        }
        return list;
    }

    /** Brute Force Approach Time Complexity O(N^2)*/
    public static int[] findIntersection(int arr1[],int arr2[]){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i = 0 ; i<arr1.length ; i++){
            for(int j= 0 ; j<arr2.length ; j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }
        int [] result = new int[list.size()];
        for(int i = 0 ;i<result.length ; i++) {
            result[i]= list.get(i);
        }
        return result;
    }
}
