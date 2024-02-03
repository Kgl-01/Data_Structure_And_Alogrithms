package Algorithm.SortingAlgorithm;

public class SelectionSorting {
    public static void main(String[] args) {
        int [] numbers = {2,4,7,3,1};
        int [] sortedNumbers = selectionSorting(numbers);

        for(int i : sortedNumbers){
            System.out.println(i);
        }
    }

    public static int[] selectionSorting(int [] arr){
        int steps=0;
        for(int i = 0 ; i<arr.length-1 ; i++){
            int lowestValueIndex = i;
            for(int j = i+1 ; j<arr.length ; j++){
                steps++;
                 if(arr[j] < arr[lowestValueIndex]){
                     lowestValueIndex=j;
                 }
            }
            if(lowestValueIndex!=i){
                steps++;
                int temp = arr[i];
                arr[i]=arr[lowestValueIndex];
                arr[lowestValueIndex]=temp;
            }
        }
        System.out.println("Steps: "+steps);
        return arr;
    }
}
