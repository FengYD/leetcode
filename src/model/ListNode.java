package model;


import lombok.Data;

/**
 * @description: ListNode in MergeTwoLists
 * @author: fengyadong
 * @Date: 2018-10-11 21:47
 **/
@Data
public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}
