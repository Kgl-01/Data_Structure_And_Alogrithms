package Practice.Exercises;

import java.util.ArrayList;
import java.util.List;

public class Chapter07 {
    public static void main(String[] args) {
        String[] stringArr = {"a", "b", "c", "d"};
        System.out.println(wordBuilder(stringArr));

        String[] clothingItems = {"Purple", "Green"};

        System.out.println(markInventory(clothingItems));

        int[][] jaggedArray = {{0, 1, 1, 1, 0}, {0, 1, 0, 1, 0, 1}, {1, 0}};

        System.out.println("CountOnes: " + countOnes(jaggedArray));

        System.out.println("isPalindrome: " + isPalindrome("rover"));


        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(towNumbersProduct(numbers));

        int[] sumArray = {10, 40, 50, 40, 60, 90};
        System.out.println(hundredSumArray(sumArray));
    }


    /*Time Complexity O(N)*/
    public static boolean hundredSumArray(int[] arr) {
        int rightIndex = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] + arr[rightIndex] != 100) {
                return false;
            }
            rightIndex--;
        }

        return true;
    }


    /*Time Complexity O(N*M)*/
    public static List twoNumbersProduct(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                list.add(arr1[i] * arr2[j]);
            }
        }

        return list;
    }

    public static List towNumbersProduct(int[] numbers) {
        List<Integer> products = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                products.add(numbers[i] * numbers[j]);
            }
        }
        return products;
    }


    /*Time Complexity O(N)*/
    public static boolean isPalindrome(String palindrome) {
        int leftIndex = 0;
        int rightIndex = palindrome.length() - 1;
        for (int i = leftIndex; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(rightIndex)) {
                return false;
            }
            rightIndex--;
        }
        return true;
    }


    /*Time Complexity O(N)*/
    public static int countOnes(int[][] jaggedArray) {
        int count = 0;
        for (int[] outer : jaggedArray) {
            for (int number : outer) {
                if (number == 1) {
                    count++;
                }
            }
        }
        return count;
    }


    /*Time Complexity O(N)*/
    public static List markInventory(String[] clothingItems) {
        List<String> list = new ArrayList<>();
        for (String item : clothingItems) {
            for (int size = 1; size <= 5; size++) {
                list.add(item + " Size: " + size);
            }
        }
        return list;
    }


    /*Time Complexity - O(N^3)*/
    public static List wordBuilder(String[] arr) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i != j && k != j && i != k) {
                        list.add(arr[i].concat(arr[j]).concat(arr[k]));
                    }
                }


            }
        }
        return list;
    }

    /*Time Complexity O(N)*/
    public static int averageOfEvenNumbers(int[] arr) {
        int sum = 0;
        int countOfEvenNumbers = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
                countOfEvenNumbers++;
            }
        }
        return sum / countOfEvenNumbers;
    }
}
