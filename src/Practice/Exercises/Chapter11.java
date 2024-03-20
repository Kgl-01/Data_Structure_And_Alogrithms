package Practice.Exercises;

import java.util.Arrays;

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
