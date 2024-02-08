package Exercises;

public class ArraySubset {
    public static void main(String[] args) {
        char [] arr1 = {'a','b','c','d','e','f'};
        char [] arr2 = {'b','d','f','h'};

        System.out.println(isSubset(arr1,arr2));
    }


    /** Time Complexity O(N*M) */
    public static boolean isSubset(char[]arr1,char[]arr2){
        char [] smallerArray;
        char [] largestArray;


        if(arr1.length > arr2.length){
            largestArray= arr1;
            smallerArray = arr2;
        }else{
            largestArray=arr2;
            smallerArray = arr1;
        }


        for(int i = 0 ; i< smallerArray.length ; i++){
            boolean foundMatch = false;
            for(int j = 0 ; j<largestArray.length ; j++){
                if(smallerArray[i]==largestArray[j]){
                    foundMatch= true;
                    break;
                }
            }
            if(!foundMatch)return false;
        }

        return true;
    }
}
