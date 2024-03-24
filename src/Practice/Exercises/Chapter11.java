package Practice.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter11 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        doubleArray(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println("Factorial Top-down approach: " + findFactorialTopDown(3));
        System.out.println("Factorial bottom-up approach: " + findFactorialBottomUp(3, 1, 1));

        int[] numberArray = {1, 2, 3, 4, 5};
        System.out.println("Arrays Sum: " + arraySum(numberArray));


        String s = "reverse";
        System.out.println("Reverse String: " + reverseString(s));


        String countX = "xaxbxcxd";
        System.out.println("CountX: " + countingX(countX));

        System.out.println("Possible paths to reach top: " + reachTop(3));


        System.out.println(anagramsOf("abcd"));


        String[] names = {"Amma", "Hello"};

        System.out.println(lengthOfStrings(names));

        System.out.println("Triangular Numbers: " + triangularNumbers(7));

        String index = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(indexOfX(index));

        System.out.println(uniquePaths(7, 3));

    }


    public static int uniquePaths(int rows, int columns) {
        if (rows == 1 || columns == 1) {
            return 1;
        }
        return uniquePaths(rows, columns - 1) + uniquePaths(rows - 1, columns);
    }

    public static int indexOfX(String str) {
        if (str.charAt(0) == 'x') {
            return 0;
        }
        return 1 + indexOfX(str.substring(1));
    }

    public static int triangularNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + triangularNumbers(n - 1);
    }

    public static int lengthOfStrings(String[] arr) {
        /*base case 1*/
        if (arr.length == 0) {
            return 0;
        }

        /*base case2*/
        /** if (arr.length == 1) {
         return arr[0].length();
         }*/

        return arr[0].length() + lengthOfStrings(Arrays.copyOfRange(arr, 1, arr.length));
    }


    public static List<String> anagramsOf(String str) {
        List<String> list = new ArrayList<>();

        if (str.length() == 1) {
            list.add(str);
            return list;
        }

        List<String> subProblemAnagrams = anagramsOf(str.substring(1));

        System.out.println(subProblemAnagrams);

        for (String s : subProblemAnagrams) {
            for (int i = 0; i <= s.length(); i++) {
                StringBuilder copy = new StringBuilder(s);
                copy.insert(i, str.charAt(0));
                list.add(copy.toString());
            }
        }

        return list;
    }


    public static int reachTop(int steps) {
        if (steps == 1 || steps == 0) {
            return 1;
        } else if (steps < 0) {
            return 0;
        }

        return reachTop(steps - 1) + reachTop(steps - 2) + reachTop(steps - 3);
    }


    public static int countingX(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        if (str.charAt(0) == 'x' || str.charAt(0) == 'X') {
            return 1 + countingX(str.substring(1));
        } else {
            return countingX(str.substring(1));
        }

    }

    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }


    public static int arraySum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        return arr[0] + arraySum(Arrays.copyOfRange(arr, 1, arr.length));
    }


    public static int findFactorialBottomUp(int n, int index, int product) {
        if (index > n) {
            return product;
        }
        return findFactorialBottomUp(n, index + 1, product * index);

    }

    public static int findFactorialTopDown(int number) {
        if (number == 1) {
            return 1;
        }
        return number * findFactorialTopDown(number - 1);
    }

    public static void doubleArray(int[] arr, int index) {
        if (index > arr.length - 1) {
            return;
        }
        arr[index] *= 2;
        doubleArray(arr, index + 1);
    }
}
