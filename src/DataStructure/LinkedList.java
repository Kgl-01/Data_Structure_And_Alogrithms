package DataStructure;

public class LinkedList <T>{
    private class Node<T>{
        T data;
        Node next;

         Node(T data){
            this.data=data;
            next=null;
        }
    }

    private Node headNode;
    private int size;

    LinkedList(){
        headNode=null;
        size=0;
    }


    public int size(){
        return size;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(headNode==null){
            headNode=newNode;
        }else{
            Node<T>currentNode = headNode;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next=newNode;
        }
        size++;
    }


    /**returns value of that particular index. Time Complexity O(N)*/
    public T get(int index){
        if(index<0||index>=size()){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node <T> currentNode = headNode;

        for(int i = 0 ; i< index;i++){
            currentNode=currentNode.next;
        }

        return currentNode.data;
    }

    /**returns index of the value. Time Complexity O(N)*/
    public int indexOf(T value){

        int index =0;
        Node<T>currentNode = headNode;
        while(currentNode!=null){
            if(currentNode.data.equals(value)){
                return index;
            }
            currentNode=currentNode.next;
            index++;
        }
        return -1;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void insertAtIndex(int index , T data){
        Node<T> newNode = new Node<>(data);

        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if(index==0){
            newNode.next = headNode;
            headNode=newNode;
            size++;
            return;
        }

        Node <T> currentNode = headNode;
        for(int i=0 ; i<index-1;i++){
            currentNode=currentNode.next;
        }

        newNode.next=currentNode.next;
        currentNode.next=newNode;
        size++;
    }


    public void removeAtIndex(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if(index==0){
            headNode= headNode.next;
            size--;
            return;
        }

        Node<T>currentNode= headNode;
        for(int i=0;i<index-1 ; i++){
            currentNode=currentNode.next;
        }

        currentNode.next=currentNode.next.next;

        size--;
    }

    public  void removeFirst(){
        if(headNode==null||headNode.next==null){
            headNode=null;
            return;
        }
        headNode=headNode.next;
        size--;
    }

    public void removeAtLast(){
        if (headNode == null || headNode.next == null) {
            headNode = null;
            return;
        }

        Node<T> currentNode = headNode;

        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = null;
        size--;
    }

    public void reverse(){
        Node <T> previousNode = null;
        Node <T> currentNode = headNode;

        while(currentNode!=null){
            Node <T> nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        headNode = previousNode;
    }



    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<T>currentNode = headNode;
        sb.append("{");
        while(currentNode!=null){
            sb.append(currentNode.data).append(currentNode.next!=null ? ", ":"");
            currentNode=currentNode.next;
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();
        list.add("once");
        list.add("upon");
        list.add("a");
        list.add("time");
        list.insertAtIndex(0,"Hello");
        list.insertAtIndex(3,"OG");
//        list.removeAtIndex(3);
//        list.removeAtIndex(list.size()-1);
//
//        list.removeAtIndex(list.size()-1);
//
//        list.removeFirst();
//        list.removeAtLast();

        list.reverse();

        System.out.println("List size"+ list.size());
        System.out.println(list);//{once, upon, a, time}
        System.out.println(list.size());//4
        System.out.println(list.get(list.size()-1));//time
        System.out.println(list.indexOf("once"));//1
        System.out.println(list.isEmpty()); //false
    }

}
