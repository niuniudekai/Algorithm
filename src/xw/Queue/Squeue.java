package xw.Queue;

import java.util.Stack;

/**
 * 两个栈实现一个队列
 */
public class Squeue<T> {

    private Stack<T> stackL = new Stack<>();
    private Stack<T> stackR = new Stack<>();

    public void add(T data){
        stackL.push(data);
    }

    public T deleteHead() throws Exception{
        while(!stackL.isEmpty()){
            stackR.push(stackL.pop());
        }

        if(stackR.isEmpty()){
            throw new Exception("the queque is empty");
        }

        return stackR.pop();
    }


    public static void main(String[] args){
        Squeue<Integer> queque = new Squeue<>();

        queque.add(1);
        queque.add(2);

        try {
            System.out.println(queque.deleteHead());
            System.out.println(queque.deleteHead());
            System.out.println(queque.deleteHead());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
 }
