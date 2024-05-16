package Practice.Algorithm.SearchingAlgo;

public class BinarySearch {
    public static void main(String[] args) {

    }


    public static int binarySearch(int[] arr, int searchValue) {
        int lowerBound = 0;
        int upperBound = arr.length - 1;

        while (lowerBound < upperBound) {
            int midPoint = (lowerBound + upperBound) / 2;
            int valueAtMidpoint = arr[midPoint];
            if (valueAtMidpoint == searchValue) {
                return midPoint;
            } else if (searchValue < valueAtMidpoint) {
                upperBound = midPoint - 1;
            } else {
                lowerBound = midPoint + 1;
            }
        }

        return -1;

    }
}
