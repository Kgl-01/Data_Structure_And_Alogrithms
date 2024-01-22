package Algorithm.SearchingAlgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int [] numbers = {98,100,1,77,10};
        int number =20;
        System.out.println(searchNumberIndex(numbers,number));
        String name = "Karthik Gowda";
        char ch = 't';
        System.out.println(searchCharIndex(name,ch));
    }


    //search number index
    static int searchNumberIndex(int [] arr , int num){
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]==num){
                return i+1;
            }
        }
        return -1;
    }


    static int searchCharIndex(String str, char ch){
        for(int i = 0 ; i < str.length() ;i++){
            if(str.charAt(i)==ch){
                return i+1;
            }
        }
        return -1;
    }

}
