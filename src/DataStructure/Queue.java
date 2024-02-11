package DataStructure;

public class Queue {
    class Node{
      private int data;
      private Node next;

       public Node(int data){
           this.data = data;
           this.next = null;
       }
    }

    private Node front;
    private Node rear;
    private int size;

    public Queue(){
        this.front=null;
        this.rear=null;
        this.size=0;
    }

    boolean isEmpty(){
        return front==null;
    }
   public void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front=newNode;
        }else{
            rear.next=newNode;
        }
       rear= newNode;
       size++;
   }

   public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int dequeuedData = front.data;
        front = front.next;
        if(front==null){
            rear=null;
        }
        size--;
        return dequeuedData;
   }

   public int peek(){
        if(isEmpty()){
            return -1;
        }
        return front.data;
   }

   public void print(){
        Node current = front;
       System.out.print("Queue: ");
       while(current!=null){
           System.out.print(current.data+" ");
           current=current.next;
       }
       System.out.println();
   }

   public int size(){
        return size;
   }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);

        q.print();
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}
