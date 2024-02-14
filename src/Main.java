import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int [] numbers = {17,3,75,202,80};
//        int num = 202;
//
//        int [] orderedArray = {3,17,75,80,202};
//        int ordNumber = 22;
//
//        System.out.println(linearSearchForOrderedArray(orderedArray,ordNumber));
//        System.out.println(linearSearch(numbers,num)+" - index");
        String[] things = {"apples","baboons","cribs","dulcimers"};

//        for(String s : things){
//            System.out.println("Here's a thing: "+ s);
//        }
        int [] numbers = {2,3,5,1,6,2,7};
//        System.out.println(greatestNumber(numbers));

//        int limit = 10;
//        printEvenNumber(10);
//        prinEvenNumbersTwo(10);
//        int [] arr1 ={3,1,4,2};
//        int [] arr2 ={4,5,3,6};
//        int [] result = intersection(arr1,arr2);
//        System.out.println(Arrays.toString(result));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter your name:");
            String name = reader.readLine();
            if(name.isEmpty()){
                throw new IOException("no input provided");
            }
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    public int averageOfEvenNumbers(int [] arr){
        int sum = 0;
        int evenNumbers=0;

        for(int i : arr){
            if(i%2==0){
                sum+=i;
                evenNumbers++;
            }
        }

        return sum/evenNumbers;
    }

    /** Time Complexity O(N2)*/
    public static boolean hasDuplicates(int [] numbers){
        int steps =0;
       for(int i = 0 ; i< numbers.length ; i++){
           for(int j = 0 ; j < numbers.length ; j++){
               steps++;
               if(i!=j && numbers[i]== numbers[j]){
                   return true;
               }
           }
       }
       System.out.println("Steps: "+steps);
       return false;
    }

    /** Time Complexity O(N)*/
    public static boolean hasDuplicatesV1(int [] numbers){
        int steps=0;
        int maxValue = getMaxValue(numbers);

       int[] existingNumbers = new int[maxValue+1];

       for(int i = 0 ; i< numbers.length ; i++){
           steps++;
           if(existingNumbers[numbers[i]]==1){
               System.out.println("Steps: "+steps);
               return true;
           }else{
               existingNumbers[numbers[i]]=1;
           }
       }
        System.out.println("Steps: "+ steps);
       return false;
    }

    static int getMaxValue(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int value :arr){
            if(value > max){
                max=value;
            }
        }
        return max;
    }

    static int greatestNumber(int[] arr){
        int maxValue = 0;
        int steps = 0;
        for(int n :arr){
            steps++;
            if(n>maxValue){
                maxValue=n;
            }
        }
        System.out.println("Steps: "+steps);
        return maxValue;
    }

    static void printEvenNumber(int upperLimit){
        int steps = 0;
        int number=2;
        for(int i = number; i<=upperLimit ; i++){
            steps++;
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("Steps: "+steps);
    }

    static void prinEvenNumbersTwo(int upperLimit){
        int number=2;
        int steps=0;
        for(int i = number; i<=upperLimit ; i+=2){
            steps++;
            System.out.println(i);
        }
        System.out.println("Steps: "+steps);
    }

    public static int[] intersection(int[]arr1,int[] arr2){
        ArrayList <Integer> al = new ArrayList<>();
        for(int i = 0 ; i<arr1.length ; i++){
            for(int j=0; j<arr2.length ; j++){
                if(arr1[i]== arr2[j]){
                    al.add(arr1[i]);
                }
            }
        }
        int [] result = new int[al.size()];
        for(int i =0 ; i< al.size() ; i++){
            result[i]=al.get(i);
        }

        return result;

    }

}

