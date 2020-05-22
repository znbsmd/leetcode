/**
 * @author zjn
 * @create 2020-05-22 21:51
 * @description 操作链表 方便测试
 */
public class OperatListNode {


    public void insert(ListNode node,int data) {
        if (node == null) {
            new ListNode(data);
            return;
        }
        ListNode cur = node;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(data);

    }

    public  void print(ListNode head) {
        ListNode cur = head;
        if (head == null) {
            return;
        }
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
