package xw.LeetCode;

public class Leet2 {
        public static class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
        }


        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode head = result;
            int flag = 0;
            while (l1 != null || l2 != null){
                int val1 = l1 == null ? 0:l1.val;
                int val2 = l2 == null ? 0:l2.val;
                int sum = val1 + val2;
                if (flag == 1) {
                    sum++;
                }
                if (sum >= 10) {
                    flag = 1;
                    sum = sum % 10;
                } else {
                    flag = 0;
                }
                result.next = new ListNode(sum);
                result = result.next;
                l1 = (l1 == null) ? null : l1.next;
                l2 = (l2 == null) ? null : l2.next;
            };

            if(flag == 1) {
                result.next = new ListNode(1);
            }

            return head.next;
        }

        public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9);

        l2.next = new ListNode(9);
//        l2.next = new ListNode(3);
//
//        l2.next.next = new ListNode(2);

        printList("l1",l1);
        printList("l2",l2);
        ListNode result = addTwoNumbers(l1,l2);
        printList("result",result);
//            System.out.println(lengthOfLongestSubstring("abcadefg"));
        }


        public static void printList(String name, ListNode l){
            System.out.print(name + ": [");
            do{
                System.out.print(l.val + ",");
            }while ((l = l.next) != null);
            System.out.println("]");
        }

}
