/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head){
      if(head==null || head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode meet=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
               meet=fast;
                break;
            }
        }
        if(slow!=fast)  return null;  
        ListNode temp=head;  
        ListNode start=meet;
        if(start==head)  return start;
        while(start!=temp){
            start=start.next;
            temp=temp.next;
            if(start==temp) return temp;
        } 
        return null;
    }
}