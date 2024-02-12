package Exercises.Recursion;

import java.io.File;
import java.io.IOException;

public class RecursionsExcersise {
    public static void main(String[] args) throws IOException {
        countdown(10);
        System.out.println(factorial(5));
        findDirectories(".");
    }

    public static void countdown(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n* factorial(n-1);
    }

    public static void findDirectories(String directory) throws IOException {
        File dir = new File(directory);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory() && !file.getName().equals(".") && !file.getName().equals("..")) {
                    System.out.println(file.getCanonicalPath());
                    findDirectories(file.getCanonicalPath());
                }
            }
        }
    }

}
