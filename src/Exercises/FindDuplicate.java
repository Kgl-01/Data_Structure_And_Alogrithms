package Exercises;

import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args) {
        String[]arr = {"a","b","c","e","f"};

        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicateTwo(arr));
    }


    /** Optimized version Time Complexity O(N)*/
    static String findDuplicateTwo(String[] arr){
        HashMap<String,Boolean> map = new HashMap<>();

        for(String s: arr){
            if(map.get(s)!= null){
                return s;
            }else{
                map.put(s,true);
            }

        }
        return "No Duplicates Found";
    }


    /** Brute Force Approach Time Complexity O(N^2)*/
    static String findDuplicate(String[]arr){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j=0; j<arr.length ; j++){
                if(i!=j && arr[i].equals(arr[j])){
                    return arr[i];
                }
            }
        }
        return "No Duplicates Found";
    }
}
