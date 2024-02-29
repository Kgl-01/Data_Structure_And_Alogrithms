package DataStructure;

public class DoublyLinkedList <T>{
    private class Node<T>{
        private T data;
        Node next;
        Node previous;

        Node(T data){
            this.data = data;
            next=null;
            previous=null;
        }
    }

    private Node headNode;
    private Node tailNode;
    private int size;

    DoublyLinkedList(){
        headNode=null;
        size=0;
    }

    public void insertAtEnd(T data){
        Node<T> newNode = new Node(data);
        if(headNode==null){
            headNode=newNode;
            tailNode=newNode;
            size++;
            return;
        }

        newNode.previous = tailNode;
        tailNode.next=newNode;
        tailNode=newNode;
        size++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Node<T> currentNode = headNode;
        while(currentNode!=null){
            sb.append(currentNode.data).append(currentNode.next!=null ?", ":"");
            currentNode=currentNode.next;
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        DoublyLinkedList<String>list = new DoublyLinkedList<>();
        list.insertAtEnd("Once");
        list.insertAtEnd("Upon");

        System.out.println(list);
        System.out.println(list.size());
    }
}
