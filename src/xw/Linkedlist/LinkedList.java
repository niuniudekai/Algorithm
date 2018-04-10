package xw.Linkedlist;

/**
 * 链表
 */
public class LinkedList {
    Node start = null;

    public LinkedList(int data){
        this.start = new Node(data);
    }

    /**增加一个结点在尾部*/
    void add(int d){
        Node end = new Node(d);
        Node n = this.start;
        while (n.getNext() != null){
            n = n.getNext();
        }
        n.setNext(end);
    }

    /**删除一个结点*/
    void deleteNode(int d){
        Node start = this.start;

        if(start.getData() == d){
            this.start = start.getNext();
            return;
        }

        Node ex = null;
        while (start != null){
            if(start.getData() == d){
                ex.setNext(start.getNext());
            }else {
                ex = start;
            }
            start = start.getNext();
        }

    }
    /**遍历输出一个链表*/
    static void printList(LinkedList linkedList){
        Node start = linkedList.start;
        System.out.print("[");
        while (start != null){
            System.out.print(start.getData() + ",");
            start = start.getNext();
        }
        System.out.println("]");
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList(0);

        for(int i = 1; i <= 10; i++) {
            linkedList.add(i);
        }

        printList(linkedList);
        linkedList.deleteNode(0);
        printList(linkedList);
        linkedList.deleteNode(1);
        printList(linkedList);
    }
}
