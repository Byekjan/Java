package com.Leetcode;

import java.util.LinkedList;

public class Ch21MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1  = new ListNode();    //Value oruulj chadaagui daraa sudlah
        ListNode l2  = new ListNode();
        ListNode result = mergeTwoLists(l1, l2);
        System.out.println(result);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;

        while (l1 != null || l2 != null) {
            if (l2 == null || (l1 != null && l1.val < l2.val)) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }

        return head.next;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
