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
    public ListNode swapPairs(ListNode head) {
       if(head==null || head.next==null) return head;
        
        ListNode l1=head;
        ListNode l2=head.next; 
        ListNode dummy=new ListNode(-1);
        ListNode d=dummy;
        while(l1!=null && l2!=null && l1.next!=null){
             int temp=l1.val;
             l1.val=l2.val;
             l2.val=temp;
             l1=l2.next;
            if(l2!=null & l2.next!=null)
             l2=l1.next; 
             // System.out.print(l1.val);
            // System.out.print(l2.val);
        }
        return head;
        
    }
}