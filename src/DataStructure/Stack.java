package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
   private List<Object> list;

   public Stack(){
     this.list = new ArrayList<>();
   }

   public void push(Object element){
      this.list.add(element);
   }

   public Object peek(){
      return list.get(this.list.size()-1);
   }

   public Object pop(){
      if(!isEmpty()){
         return this.list.remove(this.list.size()-1);
      }
      return null;
   }

   public boolean isEmpty(){
      return this.list.isEmpty();
   }

}
