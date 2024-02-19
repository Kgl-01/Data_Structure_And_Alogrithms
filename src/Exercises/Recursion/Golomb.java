package Exercises.Recursion;

import java.util.Hashtable;

public class Golomb {
    public static void main(String[] args) {
        System.out.println(golomb(30));

        Hashtable<Integer,Integer> memo= new Hashtable<>();

        System.out.println("Optimized: "+ optimizedGolomb(5,memo));
    }


    /**Bad... Time Complexity O(2^n)*/
    static int golomb(int n){
        if(n==1){
            return 1;
        }
        /**So here we can store the value returned from the sub-problem
         and solve this. Because we have many overlapping sub-problems i.e,
         the values that n-1 calculates has already been calculated by the n-golomb(golomb(n-1)).
         So when ever the function runs it there will be duplicate function calls.
         */
        return 1+golomb(n-golomb(golomb(n-1)));
    }


    /**Good... Time Complexity O(N) -- It's basically 2n-1, but in Big O constants are not consider and it's reduced to O(N)*/
    static int optimizedGolomb(int n, Hashtable<Integer,Integer>memo){
        if(n==1){
            return 1;
        }

        /**Dynamic programming comes into action. This algo uses hashtable to memoize the previously
         calculated values and prevents duplicate fn calls.
          */
        if(!memo.containsKey(n)){
            memo.put(n,1+optimizedGolomb(n-optimizedGolomb(optimizedGolomb(n-1,memo),memo),memo));
        }

        return memo.get(n);
    }


}
