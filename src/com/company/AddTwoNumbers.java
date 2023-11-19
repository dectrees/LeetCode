package com.company;

import sun.security.util.AuthResources_it;

import java.io.CharArrayReader;
import java.util.*;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/18/2023, Saturday
 **/
public class AddTwoNumbers {
    public ListNode addTwoNumbersBackward(ListNode l1, ListNode l2) {
        if(l1 ==null && l2 == null) return null;
        if(l1 == null && l2 != null ) return l2;
        if(l1 != null && l2 == null) return l1;
        Stack<ListNode> st1= new Stack<>();
        Stack<ListNode > st2 = new Stack<>();
        int carry = 0;
        ListNode tmp1=l1,tmp2=l2;
        while (tmp1 != null)
        {
            st1.push(tmp1);
            tmp1 = tmp1.next;
        }
        while(tmp2 != null)
        {
            st2.push(tmp2);
            tmp2 = tmp2.next;
        }
        int mark = st1.size() > st2.size()? 1:2;
        while(!st1.isEmpty() ||!st2.isEmpty()){
            ListNode ln1 = st1.isEmpty()?null:st1.pop();
            ListNode ln2 = st2.isEmpty()?null:st2.pop();
            int val1 = (ln1 == null)? 0:ln1.val;
            int val2 = (ln2 == null)? 0:ln2.val;
            int sum = val1+ val2+ carry;
            if(sum>=10) { carry = 1; sum=sum%10;}
            else carry = 0;
            if(mark == 1 ) ln1.val = sum;
            else ln2.val = sum;
        }
        if(carry == 1)
        {
            ListNode tmp = (mark==1)? l1:l2;
            ListNode head = new ListNode(1,tmp);
            head.next = tmp;
            return head;
        }
        else
        {
            return (mark==1)? l1:l2;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        if(l1 ==null && l2 == null) return null;
        if(l1 == null && l2 != null ) return l2;
        if(l1 != null && l2 == null) return l1;
        int carry = 0;
        int mark = 0;
        ListNode tmp1=l1,tmp2=l2,pre=l1;
        while(tmp1!=null || tmp2!=null )
        {
            int val1 = tmp1 == null?0:tmp1.val;
            int val2 = tmp2 == null?0:tmp2.val;
            int sum = val1+ val2+ carry;
            if(sum>=10) { carry = 1; sum=sum%10;}
            else carry = 0;
            if(tmp1 != null) { tmp1.val = sum; mark = 1;pre = tmp1;tmp1 = tmp1.next;}
            if(tmp2 != null) { tmp2.val = sum; mark = 2; pre = tmp2;tmp2 = tmp2.next;}
        }
        if(carry == 1)
        {
            ListNode ln = new ListNode(1,null);
            pre.next = ln;
        }
        return mark == 1?l1:l2;
    }

    public static void main(String[] args) {
        ListNode l13 = new ListNode(3,null);
        ListNode l12 = new ListNode(4,l13);
        ListNode l11 = new ListNode(2,l12);

//        ListNode l23 = new ListNode(4,null);
        ListNode l22 = new ListNode(6,null);
        ListNode l21 = new ListNode(5,l22);
        AddTwoNumbers ATN = new AddTwoNumbers();
        ListNode ln = ATN.addTwoNumbers(l11,l21);
//        ListNode ln = l11;
        while(ln != null)
        {
            System.out.print(ln.val+"-");
            ln = ln.next;
        }
    }
}
