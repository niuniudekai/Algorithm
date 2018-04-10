package xw.stack;

import xw.Linkedlist.Node;

/**
 * 使用链表实现的栈
 */
public class stack {
    Node top;

    /**出栈*/
    Object pop(){
        if(top != null){
            Object data = top.getData();
            top = top.getNext();
            return data;
        }
        return null;
    }

    /**进栈*/
    void push(Object data){
        Node node = new Node((int)data);
        node.setNext(top);
        top = node;
    }

    /**返回头结点的数据*/
    Object peek(){
        return top.getData();
    }
}
