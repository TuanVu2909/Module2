package Date17_04.Queue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.tail = null;
        this.head = null;
    }
    public  void enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null){
            this.head = this.tail = temp;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
}
