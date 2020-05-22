/**
 * @author zjn
 * @create 2020-05-22 17:31
 * @description 反转链表
 */
public class TwoZeroSix {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        OperatListNode operatListNode = new OperatListNode();

        for (int i = 2; i < 5; i++) {

            operatListNode.insert(node,i);
        }

        ListNode reverseNode = new TwoZeroSix().reverseList(node);
        operatListNode.print(reverseNode);

    }

    public ListNode reverseList(ListNode head) {

         // 操作三个指针
         ListNode pre = null;
         ListNode cur = head;
         ListNode tmp = null;

         while (cur != null){
             // tmp 指向 下一个节点
             tmp = cur.next;
             // 反转 当前节点下一个 被 pre 赋值，第一次为null
             cur.next = pre;
             // 把前一个节点 向后 推
             pre = cur;
             // 当前节点向后推
             cur = tmp;
         }

         return pre;



    }
}
