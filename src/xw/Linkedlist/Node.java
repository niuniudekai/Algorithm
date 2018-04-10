package xw.Linkedlist;

/**
 * 一个基本的单向链表
 */
public class Node {
    private Node next = null;
    private int data;

    public Node(int data){
        this.data = data;
    }

    /**增加一个结点在尾部*/
    void add(int d){
        Node end = new Node(d);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    /**删除一个结点*/
    Node deleteNode(Node head,int d){
        Node start = head;

        if(start.data == d){
            return head.next;
        }

        while (start.next != null){
            if(start.next.data == d){
                start.next = start.next.next;
                return head;
            }
            start = start.next;
        }
        return head;
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
