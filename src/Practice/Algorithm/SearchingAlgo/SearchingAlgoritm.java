package Practice.Algorithm.SearchingAlgo;

public class SearchingAlgoritm {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 45, 44, 5};
        System.out.println(linearSearch(numbers, 45));
        System.out.println(binarySearch(numbers, 44));
    }


    public static int binarySearch(int[] arr, int searchValue) {
        int lowerBound = 0;
        int upperBound = arr.length - 1;

        while (lowerBound <= upperBound) {
            int midPoint = (lowerBound + upperBound) / 2;

            int valueAtMidPoint = arr[midPoint];

            if (valueAtMidPoint == searchValue) {
                return midPoint;
            } else if (searchValue < valueAtMidPoint) {
                upperBound = midPoint - 1;
            } else if (searchValue > valueAtMidPoint) {
                lowerBound = midPoint + 1;
            }

        }

        return -1;

    }

    /* Time Complexity of linear search algo is O(N)*/
    public static int linearSearch(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
