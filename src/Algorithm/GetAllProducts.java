package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class GetAllProducts {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int [] arr1 = {1,2,3};
        int [] arr2 = {10,100,1000};
        System.out.println(getProductsOfMultipleDatasets(arr1,arr2));
    }

    /**Time complexity O(N^2)*/
    public static List<Integer>getAllProducts(int []numbers){
        int cnt =0;
        List <Integer> products=new ArrayList<>();
        for(int i = 0 ; i<numbers.length-1;i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                cnt++;
                products.add(numbers[i]*numbers[j]);
            }
        }
        System.out.println(cnt);
        return products;
    }


    /** Time complexity O(N*M)*/
    static List<Integer>getProductsOfMultipleDatasets(int[]arr1,int[]arr2){
        List <Integer> getProducts = new ArrayList<>();
        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j<arr2.length ; j++){
                getProducts.add(arr1[i]*arr2[j]);
            }
        }
        return getProducts;
    }
}
