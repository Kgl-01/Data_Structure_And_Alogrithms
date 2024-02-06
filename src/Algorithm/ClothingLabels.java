package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class ClothingLabels {
    public static void main(String[] args) {
        String [] arr= {"Purple Shirt","Green Shirt"};

        List <String> clothingOptions = markInventory(arr);
        System.out.println(clothingOptions);
    }

    public static List<String>markInventory(String[]arr){
        List <String> clothingOptions = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 1 ; j<=5 ; j++){
                clothingOptions.add(arr[i]+"Size: "+j);
            }
        }
        return clothingOptions;
    }
}
