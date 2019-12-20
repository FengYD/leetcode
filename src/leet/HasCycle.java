package leet;

import model.ListNode;

/**
 * @author fengyadong001
 * @date 2019/12/20 8:07 PM
 * @description
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode p = head;
        ListNode q = head;
        while (p != null && q!= null) {
            p = p.next;
            q = q.next;
            if (q == null) {
                return false;
            }
            q = q.next;
            if (p == q) {
                return true;
            }
        }
        return false;
    }

}