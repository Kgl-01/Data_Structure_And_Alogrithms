package Practice.Exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Chapter12 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println(findMax(numbers));

        System.out.println(findMaxGood(numbers));

        System.out.println(fibonacci(6));

        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(fibonacciDP(6, map));

        int[] hundred = {10, 50, 60};
        System.out.println(addUntilHundred(hundred));

        Map<Integer, Integer> golombMap = new HashMap<>();
        System.out.println(golomb(5, golombMap));
        System.out.println(golombMap);
    }


    public static int golomb(int n, Map<Integer, Integer> map) {
        if (n == 1) {
            return 1;
        }

        if (!map.containsKey(n)) {
            map.put(n, 1 + golomb(n - golomb(golomb(n - 1, map), map), map));
        }

        return map.get(n);
    }


    public static int addUntilHundred(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int addUntilHundredSubProblem = addUntilHundred(Arrays.copyOfRange(arr, 1, arr.length));

        if ((arr[0] + addUntilHundredSubProblem) > 100) {
            return addUntilHundredSubProblem;
        }
        return arr[0] + addUntilHundredSubProblem;
    }


    /*Time complexity O(N)-----[O(2N-1)---> dropping constants provide O(N)]*/
    public static int fibonacciDP(int n, Map<Integer, Integer> map) {

        if (n == 0 || n == 1) {
            return n;
        }

        if (!map.containsKey(n)) {
            map.put(n, fibonacciDP(n - 2, map) + fibonacciDP(n - 1, map));
        }

        return map.get(n);
    }


    /*O(2^N)*/
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }


    /*Time Complexity O(N)*/
    public static int findMaxGood(int[] arr) {

        if (arr.length == 1) {
            return arr[0];
        }

        int maxOfSubArray = findMaxGood(Arrays.copyOfRange(arr, 1, arr.length));

        if (arr[0] > maxOfSubArray) {
            return arr[0];
        } else {
            return maxOfSubArray;
        }
    }

    /*Time Complexity O(2^N)*/
    public static int findMax(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        if (arr[0] > findMax(Arrays.copyOfRange(arr, 1, arr.length))) {
            return arr[0];
        } else {
            return findMax(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
}
