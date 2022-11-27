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
     ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
         return head;
    }
    public ListNode removeNodes(ListNode head) {
       ListNode head1= reverse(head);
        ListNode curr= head1;
        ListNode max=head1;
        ListNode temp; 
      while (curr != null && curr.next != null) {
           if ( max.val>curr.next.val) {
                temp = curr.next;
                curr.next = temp.next;
                  temp = null;
            }
            else {
                curr = curr.next;
                max=curr;
            }
      }
        ListNode head2=reverse(head1);
        return head2;  
    }
}