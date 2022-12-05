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
    public ListNode middleNode(ListNode head) {
          if(head.next==null)  return head;
        
        // ListNode slow=head;
        // ListNode fast=head;
        ListNode curr=head;
        int count=0;
        
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        int mid=count/2;
        ListNode ans=head;
        int i=0;
        while(ans!=null && i<mid){
          ans=ans.next;
            i++;
        }
  
        return ans; 
    }
}