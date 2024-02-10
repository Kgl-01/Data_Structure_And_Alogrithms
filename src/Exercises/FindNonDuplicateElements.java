package Exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindNonDuplicateElements {
    public static void main(String[] args) {
        String word = "minimum";
        System.out.println(findNonDuplicate(word));
        System.out.println(findNonDuplicateOptimised(word));
    }



    /**Optimised version Time Complexity O(N)*/
    static String findNonDuplicateOptimised(String str){
        Map<String,Integer> map = new HashMap<>();

        for(String s : str.split("")){
            if(map.get(s)!=null){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }

        for(String s :str.split("")){
            if(map.get(s)==1){
                return s;
            }
        }


        return "No non-duplicates found";
    }

    /**Brute force approach Time Complexity O(N^2)*/
    static String findNonDuplicate(String str){
        int [] counter = new int[26];
        str=str.toLowerCase();
        for(int i = 0 ; i< str.length() ; i++){
            int index = str.charAt(i)-'a';
            counter[index]=1;
            for(int j = 0 ; j< str.length() ; j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    counter[index]++;
                }
            }
        }
        for(int i = 0 ; i <counter.length ; i++){
            if(counter[i]==1){
                return String.valueOf((char)('a'+ i));
            }
        }
        return "No non-duplicates found";
    }
}
