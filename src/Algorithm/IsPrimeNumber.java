package Algorithm;

public class IsPrimeNumber {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(isPrime(number));
    }


    /** Algorithm's Time Complexity : O(N) */
    static boolean isPrime(int number){
        for(int i = 2 ; i < number ; i++){
            if(number % i==0) {
                return false;
            }
        }
        return true;
    }
}
