package Algorithm.SortingAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int [] numbers={4,2,7,1,3};
       insertionSorting(numbers);

        System.out.println(Arrays.toString(numbers));
    }
    public static void insertionSorting(int [] arr){
        for(int i = 1 ; i < arr.length ; i++){
            //first we'll pop out the value from a particular index of array
            int temp = arr[i];

            //we'll declare the position variable that contains index starting immediately to the left of temp value
            int position;

            for(position= i-1 ; position>=0; position--){
                if(arr[position] > temp){
                    arr[position+1]=arr[position];
                }else{
                    break;
                }
            }
            arr[position+1]=temp;
        }
    }
}
