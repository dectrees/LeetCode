package com.company;

import sun.java2d.pipe.LCDTextRenderer;
import sun.plugin2.util.NativeLibLoader;

import java.util.List;
import java.util.Stack;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/21/2023, Tuesday
 **/
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ln = head;
        Stack<ListNode> stack = new Stack<>();
        while(ln!=null){
            stack.push(ln);
            ln = ln.next;
        }
        int i = 0;
        ListNode lTmp = null;
        ListNode next = null;
        while(i++<n && !stack.isEmpty())
        {
            lTmp = stack.pop();
        }
        if(!stack.isEmpty()) {
            next = lTmp.next;
            lTmp = stack.pop();
            lTmp.next = next;
        }
        else if(i-1 == n) head = lTmp.next;
        return head;
    }

    public static void main(String[] args) {
//        ListNode ln5 = new ListNode(5,null);
//        ListNode ln4 = new ListNode(4,ln5);
//        ListNode ln3 = new ListNode(3,ln4);
//        ListNode ln2 = new ListNode(2,ln3);
        ListNode ln1 = new ListNode(1,null);

        RemoveNthNode RN = new RemoveNthNode();

        ListNode ln = RN.removeNthFromEnd(ln1,1);;
        while (ln != null) {
            System.out.print(ln.val);
            ln = ln.next;
        }
    }
}
