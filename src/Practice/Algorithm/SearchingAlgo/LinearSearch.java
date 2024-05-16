package Practice.Algorithm.SearchingAlgo;

public class LinearSearch {
    public static void main(String[] args) {

    }

    public static int search(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

}
