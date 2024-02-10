package Exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingLetter {
    public static void main(String[] args) {
        String str = "the quick brown bix jumps over a lazy dog";
        System.out.println(missingLetter(str));
        System.out.println(missingLetterTwo(str));
    }


    /** Time Complexity O(N) using hashmap*/
    static char missingLetterTwo(String str){
        Map<Character,Boolean> map = new HashMap<>();
        str=str.toLowerCase();

        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                map.put(c,true);
            }
        }

        for(char c='a' ; c<='z' ;c++){
            if(map.get(c)==null){
                return c;
            }
        }

        return '0';

    }

    /** Time Complexity O(N)*/
    static char missingLetter(String str){
        boolean [] alphabetPresent = new boolean[26];
        str=str.toLowerCase();

        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                int index = c-'a';
                alphabetPresent[index]=true;
            }
        }

        for(int i = 0 ; i<alphabetPresent.length ; i++){
            if(!alphabetPresent[i]){
                return (char)('a'+i);
            }
        }
        return '0';
    }
}
