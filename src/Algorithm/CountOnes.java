package Algorithm;

public class CountOnes {
    public static void main(String[] args) {
        int [][] sample={
                         {0,1,1,1,0},
                         {0,1,1,1,0,1},
                         {1,0}
                         };

        System.out.println("Total Ones: "+countOnes(sample));
    }

    public static int countOnes(int[][]arr){
        int count=0;
        for(int i = 0 ; i<arr.length ; i++){
            for(int num:arr[i]){
                if(num==1){
                    count++;
                }
            }
        }
        return count;
    }
}
