package xw.Linkedlist;

/**
 * 找到链表的倒数第K个节点
 */
public class find {

    static int find(LinkedList linkedList, int k){
        Node start = linkedList.getStart();
        Node runner1 = start;
        Node runner2 = start;

        for(int i = 0; i < k; i++){
            runner2 = runner2.getNext();
        }

        while (runner2 != null){

            runner2 = runner2.getNext();
            runner1 = runner1.getNext();
        }

        return runner1.getData();
    }


    public static void main(String[] args){
        LinkedList linkedList = new LinkedList(0);

        for(int i = 1; i <= 10; i++) {
            linkedList.add(i);
        }

        LinkedList.printList(linkedList);
        System.out.println(find(linkedList,3));

    }

}
