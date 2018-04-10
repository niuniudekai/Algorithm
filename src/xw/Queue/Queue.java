package xw.Queue;

import xw.Linkedlist.Node;

/**
 * 使用链表实现的队列
 */
public class Queue {
    Node first,last;

    /**入队操作*/
    void enqueue(Object data){
        if(first == null){
            last = new Node((int)data);
            first = last;
        }else {
            last.setNext(new Node((int)data));
            last = last.getNext();
        }
    }

    /**出队操作*/
    Object dequeque(){
        if(first != null){
            Object data = first.getData();
            first = first.getNext();
            return data;
        }
        return null;
    }
}
