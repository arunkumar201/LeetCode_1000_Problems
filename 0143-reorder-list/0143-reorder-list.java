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
class Solution {
      static ListNode rev(ListNode head){
          ListNode prev = null;
           ListNode current = head;
            ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    public void reorderList(ListNode head) {
        ListNode mid=head;
        ListNode l=head;
        ListNode h=head;  
        while(h!=null && h.next!=null){
           l=l.next;
          h=h.next.next;
        }
        ListNode secondHalf = l.next;
        l.next = null;
       ListNode revList=rev(secondHalf);
       ListNode t=head,r=revList;
        while(r!=null){
        ListNode firstHalfNext = t.next;
        ListNode secondHalfNext = r.next;
            t.next=r;
          r.next=firstHalfNext;
          t=firstHalfNext;
          r=secondHalfNext;
        }
    }
}