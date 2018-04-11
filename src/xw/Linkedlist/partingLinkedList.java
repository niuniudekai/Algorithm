package xw.Linkedlist;

import java.util.Random;

/**
 * 给出一个基准x，把所有比x小的结点排在比x大或等于的后面
 */
public class partingLinkedList {

    static void parting(LinkedList linkedList, int x){

        if(linkedList.start == null){
            return;
        }

        LinkedList min = new LinkedList();
        LinkedList max = new LinkedList();

        Node start = linkedList.getStart();

        while (start != null){
            if (start.getData() < x){
                min.add(start.getData());
            }else{
                max.add(start.getData());
            }
            start = start.getNext();
        }

        Node minStart = min.getStart();
        while (minStart.getNext() != null){
            minStart = minStart.getNext();
        }

        minStart.setNext(max.getStart());
        linkedList.setStart(min.getStart());
    }

    public static void main(String[] args){
        LinkedList linkedlist = new LinkedList();
        Random random = new Random(27);
        for(int i = 1; i <= 10; i++) {
            linkedlist.add(random.nextInt(10));
        }

        LinkedList.printList(linkedlist);

        parting(linkedlist,5);

        LinkedList.printList(linkedlist);
    }

}
