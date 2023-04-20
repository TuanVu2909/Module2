package Date17_04.Queue;

public class Node {
    public Node next;
    private int key;


    public Node() {
    }

    public Node(int key) {
        this.key = key;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
