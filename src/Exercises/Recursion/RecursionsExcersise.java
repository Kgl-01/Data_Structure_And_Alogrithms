package Exercises.Recursion;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RecursionsExcersise {
    public static void main(String[] args) throws IOException {
      countDown(10);

      System.out.println("Factorial: "+factorial(5));

      findDirectories(".");

      int [] arr = {1,2,3,4,5};

      System.out.println("Even Numbers: "+evenNumbers(arr));


      System.out.println("Sum: "+ sum(arr,arr.length-1));
      doubleArray(arr,0);
      System.out.println(Arrays.toString(arr));


      String str = "Karthik Gowda L";
      System.out.println(reverseString(str));

      String xWord = "axbxcxd";
      System.out.println("Total x found in the string: " + countX( xWord));

      int noOfStairs=5;
      System.out.println("Possible paths to reach the top: "+ numberOfPaths(noOfStairs));

        System.out.println(anagramsOf("abcd"));

        String [] stringArray = {"abc","c","def","ghij"};

        System.out.println("Total Characters: "+ totalCharCount(stringArray,0));

        System.out.println("Triangular Numbers: "+ triangularNumbers(6));

        System.out.println("Index of X: "+findIndexOfX("abcdefghijklmnopqrstuvwxyz"));

        System.out.println("unique paths from start to finish: "+uniquePaths(7,3));

        System.out.println("Maximum number: "+ maxNumber(new int[]{1,2,3,4}));

        System.out.println("Fibonacci Number: "+fibonacci(6));

    }


    static int fibonacci(int n){
        if(n==1||n==0){
            return n;
        }
        return fibonacci(n-2)+fibonacci(n-1);
    }


    static int maxNumber(int [] arr){
        if(arr.length==1){
            return arr[0];
        }

        int maxValue = maxNumber(Arrays.copyOfRange(arr,1,arr.length));

        if(arr[0]> maxValue){
            return arr[0];
        }else{
            return maxValue;
        }
    }


    static int uniquePaths(int rows, int columns){
        if(rows==1||columns==1){
            return 1;
        }
        return uniquePaths(rows-1,columns)+uniquePaths(rows,columns-1);
    }


    static int findIndexOfX(String str){

        if(str.charAt(0)=='x'){
            return 0;
        }

        return findIndexOfX(str.substring(1))+1;
    }

    static int triangularNumbers(int n){
        if(n==0){
            return 0;
        }
        return triangularNumbers(n-1)+n;
    }


    static List <Integer> evenNumbers(int[]array){
        List<Integer> result = new ArrayList<>();
        if (array.length == 0)
            return result;

        if (array[0] % 2 == 0) {
            result.add(array[0]);
        }

        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 1, newArray, 0, newArray.length);

        result.addAll(evenNumbers(newArray));

        return result;
    }


    static int totalCharCount(String [] arr, int index){
        if(index==arr.length){
            return 0;
        }
        return arr[index].length()+totalCharCount(arr,index+1);
    }

    public static List<String> anagramsOf(String string) {
        List <String> collections = new ArrayList<>();

        if(string.length()==1){
            collections.add(string);
            return collections;
        }


        List <String> subStringOfAnagrams = anagramsOf(string.substring(1));


        for(String subStringAnagram: subStringOfAnagrams){
            for(int i = 0 ; i<= subStringAnagram.length() ; i++){
                StringBuilder copy = new StringBuilder(subStringAnagram);
                copy.insert(i, string.charAt(0));
                collections.add(copy.toString());
            }
        }


        return collections;

    }




    static int numberOfPaths(int n){
        if(n<0){
            return 0;
        }

        if(n==1||n==0){
            return 1;
        }

        return numberOfPaths(n-1) + numberOfPaths(n-2) + numberOfPaths(n-3);
    }

    static int countX(String str){
        if(str.isEmpty()){
            return 0;
        }
        if(str.charAt(0)=='x'){
            return 1 + countX(str.substring(1));
        }else{
            return countX(str.substring(1));
        }

    }

    static String reverseString(String str){
        if(str.length()==1){
            return str;
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }



    static int sum(int[]arr,int index){
        if(index==0){
            return arr[index];
        }
        return arr[index]+ sum(arr,index-1);
    }


    public static void doubleArray(int [] arr,int index){
        if(index==arr.length){
            return;
        }
        arr[index]*=2;
        doubleArray(arr,index+1);
    }

    public static void findDirectories(String directory) throws IOException {
        File dir = new File(directory);
        if(!dir.exists() || !dir.isDirectory()){
            System.out.println("Directory doesn't exits or invalid path provided.");
            return;
        }

        File [] files = dir.listFiles();
        if(files!=null){
            for(File file:files){
                if(file.isDirectory()&&!file.getName().equals(".")&&!file.getName().equals("..")){
                    System.out.println(file.getCanonicalPath());
                    findDirectories(file.getCanonicalPath());
                }
            }
        }
    }

    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }


    /**recursive-type 1 executes a task till it meets the base case*/
    static void countDown(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        countDown(n-1);
    }

}
