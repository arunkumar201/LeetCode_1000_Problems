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
     public ListNode mergeNodes(ListNode head) {
        int sum=0;
    ListNode dummy=new ListNode(-1);
        ListNode l1=head;
        ListNode l2=head;
        ListNode d=dummy;
        l2=l2.next;
   while(l2!=null){ 
       if(l1.val==0 && l2.val!=0){
           sum+=l2.val;
           l2=l2.next;
       }else{
           ListNode nd=new ListNode(sum);
           d.next=nd;
           d=nd;
           l1=l2;
           l2=l2.next;
           sum=0;   
       }  
   }
        return dummy.next;   
    }
 
}