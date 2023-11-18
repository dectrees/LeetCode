package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/

import com.sun.javafx.image.BytePixelSetter;
import com.sun.scenario.effect.Merge;

import java.util.ListIterator;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


public class MergeList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmpList1 = list1,swapList1, tmpList2 = list2, prevList2 =list2;
        while(tmpList1 != null)
        {
            if(tmpList2 != null)
            {
                if (tmpList1.val < tmpList2.val) {
                    swapList1 = tmpList1.next;
                    tmpList1.next = tmpList2;
                    if(tmpList2 == list2) { list2 = tmpList1;prevList2=tmpList1;}
                    else prevList2.next = tmpList1;
                    prevList2 = tmpList1;
                    tmpList1 = swapList1;
                } else {
                    prevList2 = tmpList2;
                    tmpList2 = tmpList2.next;
                }
            }else if(prevList2 != null) { prevList2.next =tmpList1;break;}
            else { return list1;}

        }
        return list2;
    }

    public static void main(String[] args) {
        ListNode no3 = new ListNode(4,null);
//        ListNode no2 = new ListNode(2,no3);
//        ListNode no1 = new ListNode(1,no2);

        ListNode node3 = new ListNode(4,null);
        ListNode node2 = new ListNode(3,node3);
        ListNode node1 = new ListNode(1,node2);

        MergeList M = new MergeList();
        ListNode ln = M.mergeTwoLists(no3,null);

        ListNode node = ln;
        while(node != null)
        {
            System.out.print(node.val+"-");
            node = node.next;
        }
    }
}
