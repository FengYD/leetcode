package leet;

import model.ListNode;

/**
 * @author fengyadong
 * @Description: Leetcode
 * @Date: 2019-09-29 22:54
 */
public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        for (int i = 1; i < n; i++) {
            p = p.getNext();
        }
        if (p.getNext() == null){
            return head.getNext();
        }
        p = p.getNext();
        while (p.getNext() != null){
            p = p.getNext();
            q = q.getNext();
        }
        if (q.getNext() != null) {
            q.setNext(q.getNext().getNext());
        } else {
            q.setNext(null);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));
        head.getNext().getNext().getNext().setNext(new ListNode(5));
        removeNthFromEnd(head, 2);
    }
}
