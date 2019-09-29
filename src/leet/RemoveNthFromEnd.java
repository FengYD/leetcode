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
            p = p.next;
        }
        if (p.next == null){
            return head.next;
        }
        p = p.next;
        while (p.next != null){
            p = p.next;
            q = q.next;
        }
        if (q.next != null) {
            q.next = q.next.next;
        } else {
            q.next = null;
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
