package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class WordBuilder {
    public static void main(String[] args) {
        String [] characters = {"a","b","c","d"};
        List<String>result = wordBuilder(characters);
        List<String>result2 = wordBuilderTwo(characters);
        System.out.println(result);
        System.out.println(result2);
    }

  static List<String> wordBuilder(String [] arr){
    List<String> collection = new ArrayList<>();
    for(int i = 0 ; i<arr.length ; i++){
        for(int j=0 ; j<arr.length ; j++){
            if(i!=j){
                collection.add(arr[i]+arr[j]);
            }
        }
    }
    return collection;
  }

  static List <String> wordBuilderTwo(String [] arr){
        List <String> collection = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j< arr.length ; j++){
                for(int k=0 ; k<arr.length ; k++){
                    if(i!=j && j!=k && i!=k){
                        collection.add(arr[i]+arr[j]+arr[k]);
                    }
                }
            }
      }
        return collection;
  }
}
