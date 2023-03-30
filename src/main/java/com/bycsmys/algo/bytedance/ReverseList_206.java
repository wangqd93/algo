package com.bycsmys.algo.bytedance;

import com.bycsmys.algo.common.ListNode;

public class ReverseList_206 {

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;

        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;

            pre = cur;
            cur = next;
        }
        return pre;
    }
}
