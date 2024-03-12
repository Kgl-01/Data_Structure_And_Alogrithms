package Practice.Exercises;

public class Chapter05 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(doubleThenSum(numbers));

    }


    public static int doubleThenSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i * 2;
        }
        return sum;
    }

    public static void printEvenNumbersV1(int upperLimit) {
        int number = 2;
        while (number < upperLimit) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }

    /*Runs much faster than V1*/
    public static void printEvenNumbersV2(int upperLimit) {
        int number = 2;
        while (number < upperLimit) {
            System.out.println(number);
            number += 2;
        }

    }
}
