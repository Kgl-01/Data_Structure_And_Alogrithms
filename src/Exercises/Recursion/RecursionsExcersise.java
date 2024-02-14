package Exercises.Recursion;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class RecursionsExcersise {
    public static void main(String[] args) throws IOException {
      countDown(10);

      System.out.println("Factorial: "+factorial(5));

      findDirectories(".");

      int [] arr = {1,2,3,4,5};

      System.out.println("Sum: "+ sum(arr,arr.length-1));
      doubleArray(arr,0);
      System.out.println(Arrays.toString(arr));


      String str = "Karthik Gowda L";
      System.out.println(reverseString(str));

      String xWord = "axbxcxd";
      System.out.println("Total x found in the string: " + countX( xWord));

      int noOfStairs=5;
      System.out.println("Possible paths to reach the top: "+ numberOfPaths(noOfStairs));
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
