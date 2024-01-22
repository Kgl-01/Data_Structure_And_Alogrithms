package Algorithm.SearchingAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {

        int numbers[]={1,10,54,78,100};
        int searchValue= 78;

        System.out.println(search(numbers,searchValue));

    }

    static int search(int arr[], int searchValue){
        int lowerBound = 0;
        int upperBound = arr.length;

        while(lowerBound <= upperBound){
            int midpoint = (lowerBound+upperBound)/2;
            int valueAtMidpoint = arr[midpoint];

             if(valueAtMidpoint==searchValue){
                 return midpoint+1;
             }
             if(searchValue < valueAtMidpoint){
                 upperBound= midpoint-1;
             }
             if(searchValue > valueAtMidpoint) {
                 lowerBound = midpoint + 1;
             }
        }
        return -1;
    }
}
