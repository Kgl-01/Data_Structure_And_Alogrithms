package Algorithm;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s){
        int leftIndex= 0;
        int rightIndex = s.length()-1;

        while(leftIndex < s.length()/2){
            if(s.charAt(leftIndex)!= s.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }

        return true;
    }
}
