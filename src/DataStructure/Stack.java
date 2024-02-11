package DataStructure;

import java.util.EmptyStackException;

public class Stack <T>{
  private class Node<T>{
      private T data;
      private Node next;

      public Node(T data) {
         this.data = data;
         this.next = null;
      }
   }

   private Node<T> top;
   int size;

   public Stack(){
      this.top=null;
      this.size=0;
   }

   public void push(T data){
      Node <T> newNode = new Node<>(data);
      newNode.next=top;
      top=newNode;
      size++;
   }

   public boolean isEmpty(){
      return size==0;
   }

   public void print(){
      Node<T> current = top;
      System.out.print("Stack: ");
      while(current!=null){
         System.out.print(current.data+" ");
         current=current.next;
      }
      System.out.println();
   }

   public T peek(){
      if(isEmpty()){
         throw new EmptyStackException();
      }
      return top.data;
   }

   public T pop(){
      if(isEmpty()){
         throw new EmptyStackException();
      }
      T data = top.data;
      top = top.next;
      size--;
      return data;
   }

   public int size(){
      return size;
   }

   public static void main(String[] args) {
      Stack<Integer> stack= new Stack<>();
      stack.push(1);
      stack.push(44);
      stack.push(10);

      stack.pop();
      stack.print();
      System.out.println(stack.size());
       System.out.println(stack.peek());
   }

}
