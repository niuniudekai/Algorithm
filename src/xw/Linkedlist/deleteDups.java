package xw.Linkedlist;

import java.util.HashMap;

/**
 * 删除链表中重复的元素，
 *  不使用额外的缓冲空间，该怎么解决？
 */
public class deleteDups {

    /**使用额外的空间*/
    public static void deleteDups1(Node start){
        if(start == null){
            return;
        }
        
        HashMap map = new HashMap();
        Node ex = null;

        while (start != null){
            if(map.containsKey(start.getData())){
                ex.setNext(start.getNext());
            }else {
                map.put(start.getData(),1);
                ex = start;
            }
            start = start.getNext();
        }
    }

    /**不使用额外的空间*/
    public static void deleteDups2(Node start){
        if(start == null){
            return;
        }

        while (start != null){
            Node ex = start.getNext();
            Node ex2 = start;
                while (ex != null){
                    if(ex.getData() == start.getData()){
                        ex2.setNext(ex.getNext());
                    }else {
                        ex2 = ex;
                    }
                    ex = ex.getNext();
                }
            start = start.getNext();
        }
    }
    
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList(0);
        for(int i = 1; i <= 10; i++) {
            linkedList.add(i);
            if(i%2 == 0){
                linkedList.add(i);
            }
        }

        LinkedList.printList(linkedList);
        deleteDups1(linkedList.getStart());
        LinkedList.printList(linkedList);

        for(int i = 3; i <= 10; i++) {
            linkedList.add(i);
            if(i%2 == 0){
                linkedList.add(i);
            }
        }
        LinkedList.printList(linkedList);
        deleteDups2(linkedList.getStart());
        LinkedList.printList(linkedList);
    }
}
