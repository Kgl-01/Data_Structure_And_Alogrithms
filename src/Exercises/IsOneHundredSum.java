package Exercises;

public class IsOneHundredSum {
    public static void main(String[] args) {
        int [] numbers ={50,20,70,50};
        System.out.println(isOneHundredSum(numbers));
    }
    static boolean isOneHundredSum(int [] arr){
        int leftIndex=0;
        int rightIndex=arr.length-1;

        while(leftIndex<=rightIndex/2){
            if(arr[leftIndex]+arr[rightIndex]!= 100){
                return  false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
