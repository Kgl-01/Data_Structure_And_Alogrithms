package Practice.Exercises;

import java.io.File;
import java.io.IOException;


public class Chapter10 {
    public static void main(String[] args) throws IOException {

        countdown(10);
        System.out.println(factorial(4));

        findDirectories("./src");
    }


    /*file traversal algo using recursion*/
    public static void findDirectories(String directory) throws IOException {
        File file = new File(directory);

        if (!file.isDirectory() && !file.exists()) {
            System.out.println("Directory doesn't exist");
            return;
        }

        File[] fileList = file.listFiles();
        if (fileList != null) {
            for (File current : fileList) {
                if (current.isDirectory() && !current.getName().equals(".") && !current.getName().equals("..")) {
                    System.out.println(current.getCanonicalPath());
                    findDirectories(current.getCanonicalPath());
                }
            }
        }

    }


    /*Finding factorial using recursive approach*/
    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }


    /*Countdown using recursive approach*/
    public static void countdown(int n) {
        System.out.println(n);
        if (n == 0) {
            return;
        }

        countdown(n - 1);
    }
}
