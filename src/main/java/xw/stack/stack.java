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
        Node node = new Node((Integer)data);
        node.setNext(top);
        top = node;
    }

    /**返回头结点的数据*/
    Object peek(){
        return top.getData();
    }


    public static void main(String[] args){
        stack stack = new stack();
        for (int i = 0 ; i < 10; i++){
            stack.push(i);
        }

        for (int i = 0; i < 10; i++){
            System.out.print(stack.pop() + ", ");
        }
    }
}
