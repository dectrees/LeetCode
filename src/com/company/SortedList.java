package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/



class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode it = head;
        ListNode iTmp = head;
        ListNode iPre = head;
        int value = it.val;
        while(it != null)
        {
              iPre = it;
              iTmp = it.next;
              while(iTmp != null)
              {
                  if(iTmp.val == it.val)
                  {
                      iTmp = iTmp.next;
                      iPre.next = iTmp;
                  }
                  else
                  {
                      iPre = iTmp;
                      iTmp = iTmp.next;
                  }
              }
              it = it.next;
        }
        return head;
    }
}
