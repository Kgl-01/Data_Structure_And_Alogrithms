package Practice.Exercises;

public class Chapter03 {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 55, 6, 65};


        System.out.println(median(numbers));
        System.out.println(isPrime(4));
        System.out.println(isLeapYear(2024));
        System.out.println(chessboardSpace(16));
        System.out.println(arraySum(numbers));
    }


    /*Time complexity O(1)*/
    public static int median(int[] arr) {

        int middle = (int) Math.floor(arr.length / 2);

        if (arr.length % 2 == 0) {
            return (arr[middle - 1] + arr[middle]) / 2;
        }
        return arr[middle];

    }


    /*Time complexity O(logN)*/
    public static int chessboardSpace(int numberOfGrains) {
        int chessboardSquare = 1;
        int placedGrains = 1;

        while (placedGrains < numberOfGrains) {
            placedGrains *= 2;
            chessboardSquare += 1;
        }

        return chessboardSquare;
    }

    /*Time Complexity O(N)*/
    static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }


    /*Time complexity O(1) as it takes same steps for all given user inputs*/
    static boolean isLeapYear(int year) {
        return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
    }


    /* Time complexity is O(N)*/
    static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}
