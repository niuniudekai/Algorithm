package xw.Linkedlist;

/**
 * 链表的节点
 */
public class Node {
    private Node next = null;
    private int data;

    public Node(int data){
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
