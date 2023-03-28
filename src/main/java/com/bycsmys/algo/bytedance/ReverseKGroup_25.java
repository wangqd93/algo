package com.bycsmys.algo.bytedance;

import com.bycsmys.algo.common.ListNode;

/**
 * leetcode 25
 * <p>
 * K个一组翻转链表
 */
public class ReverseKGroup_25 {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode tail = head;

        for (int i = 0; i < k; i++) {
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }

        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);

        return newHead;
    }


    private ListNode reverse(ListNode head, ListNode tail) {
        ListNode pre = null;
        while (head != tail) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }


}
