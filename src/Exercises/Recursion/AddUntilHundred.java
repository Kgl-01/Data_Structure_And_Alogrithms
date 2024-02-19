package Exercises.Recursion;

import java.util.Arrays;

public class AddUntilHundred {
    public static void main(String[] args) {

    }

    /** Bad.... Time Complexity O(2^N)*/
    static int addUntilHundred(int [] arr){
        if(arr.length==0){
            return 0;
        }

        /**Here for each comparison the function is called itself twice.
         During 1st comparison the 0th index value is added to the sum of remainder
         of the array and if it's greater than 100 it returns the sum of the sub-problem.
         or else returns the sum along with the addition of the 0th index value. The same function
         is called during comparison and while returning the value. Which gives us time complexity
         of O(2^N);
         */
        if((arr[0]+ addUntilHundred(Arrays.copyOfRange(arr,1,arr.length-1)))>100){
            return addUntilHundred(Arrays.copyOfRange(arr,1,arr.length-1));
        }else{
            return arr[0]+ addUntilHundred(Arrays.copyOfRange(arr,1,arr.length-1));
        }
    }

    /**Optimized solution. Time Complexity O(N)*/
    static int optimizedAddUntilHundred(int [] arr){
        if(arr.length==0){
            return 0;
        }

        /**In this solution instead of calling function twice i.e, each time while doing comparison
         and returning values, the sum of the sub-problem is stored in a variable. The good thing about this is
         the function is called only n(in this case the arr length) times which reduces the mountainous time-complexity of O(2^N)
         to O(N).
          */
        int sumOfSubProblem = optimizedAddUntilHundred(Arrays.copyOfRange(arr,1,arr.length-1));

        if((arr[0]+sumOfSubProblem)>100){
            return sumOfSubProblem;
        }else{
            return arr[0]+sumOfSubProblem;
        }
    }
}
