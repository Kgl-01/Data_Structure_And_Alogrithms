package DataStructure;

/**Queues as doubly linked list*/
public class QueueDLL <T>{
    private DoublyLinkedList<T> list;
    QueueDLL(){
    this.list = new DoublyLinkedList<>();
    }

    public void enqueue(T data){
        list.insertAtEnd(data);
    }

    public T dequeue(){
    return list.removeFromFront();
    }

    public T read(){
        if(list.isEmpty()){
            throw new NullPointerException("Null");
        }
        return (T) list.headNode.data;
    }

    public String toString(){
        return list.toString();
    }

    public int size(){
        return list.size();
    }

    public static void main(String[] args) {
        QueueDLL <String> q = new QueueDLL<>();
        q.enqueue("Once");
        q.enqueue("upon");
        q.enqueue("a");
        q.enqueue("time");

        System.out.println(q);
        System.out.println(q.size());

        System.out.println(q.read());

        q.dequeue();

        System.out.println(q);
        System.out.println(q.read());

    }

}
