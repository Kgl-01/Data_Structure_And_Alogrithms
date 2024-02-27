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

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1));
        System.out.println(list.indexOf("upon"));
    }

}
