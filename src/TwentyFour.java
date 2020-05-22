/**
 * @author zjn
 * @create 2020-05-21 14:08
 * @description  链表 两两交换
 */

public class TwentyFour {

    /**
     *
     * test
     * @param args
     */
    public static void main(String[] args) {

        ListNode node = new ListNode(1);

        OperatListNode operatListNode = new OperatListNode();

        operatListNode.insert(node,2);
        operatListNode.insert(node,3);
        operatListNode.insert(node,4);


        ListNode listNode = new TwentyFour().swapPairs(node);

        operatListNode.print(listNode);


    }


    /**
     * 一定要注意 是链表交换顺序 不是val值交换
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {


        if(head == null || head.next == null){
            return head;
        }

        ListNode next = head.next;

        // next 后面就不管了，直接递归。。。。
        next.next = swapPairs(next.next);

        //下面两行代码是交换链表两个节点
        head.next = next.next;
        next.next = head;

//        print(next);
        // 交换后，next 就是前面的节点
        return next;



    }



}
