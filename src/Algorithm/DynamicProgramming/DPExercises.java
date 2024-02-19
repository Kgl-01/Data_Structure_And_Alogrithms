package Algorithm.DynamicProgramming;


import java.util.Hashtable;

public class DPExercises {
    public static void main(String[] args) {

        Hashtable<Integer,Integer> memo= new Hashtable<>();
        System.out.println("Memoized fibonacci: "+fibonacci(6,memo));
        System.out.println(memo);

        System.out.println(fibonacci(10));

    }


    /**Using memoization method to solve overlapping sub-problems Time-Complexity O(N)*/
    static int fibonacci(int n, Hashtable<Integer,Integer> memo){
        System.out.println("Memo");
        if(n==0||n==1){
            return n;
        }
        if(!memo.containsKey(n)){
            memo.put(n, fibonacci(n-2,memo)+fibonacci(n-1,memo));
        }

        return memo.get(n);
    }

    /** Using bottom-up technique Time Complexity O(N)*/
    static  int fibonacci(int n){
        if(n==0){
            return n;
        }

        int a = 0;
        int b = 1;

        for(int i = 1 ;i<n;i++){
            int temp = a;
            a=b;
            b= temp+a;
        }

        return b;
    }

}
