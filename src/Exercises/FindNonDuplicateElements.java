package Exercises;

import java.util.Arrays;

public class FindNonDuplicateElements {
    public static void main(String[] args) {
        String word = "minimum";
        System.out.println(findNonDuplicate(word));
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
        return "No duplicates found";
    }
}
