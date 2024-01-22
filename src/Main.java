
public class Main {
    public static void main(String[] args) {
        int [] numbers = {17,3,75,202,80};
        int num = 202;

        int [] orderedArray = {3,17,75,80,202};
        int ordNumber = 22;

        System.out.println(linearSearchForOrderedArray(orderedArray,ordNumber));
        System.out.println(linearSearch(numbers,num)+" - index");
    }

    public static int linearSearch(int numbers[], int num){

    for(int i = 0 ; i<numbers.length ;i++){
        if(numbers[i]==num){
            return i;
        }
    }
         return -1;
    }

    static int linearSearchForOrderedArray(int[] numbers, int num){
        for(int i = 0 ; i <numbers.length ; i++){
            if(numbers[i]== num){
                return i;
            }else if(numbers[i]> num){
                return -1;
            }
        }
             return -1;
    }
}

