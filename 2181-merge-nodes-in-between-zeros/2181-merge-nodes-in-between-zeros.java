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
   //   public ListNode mergeNodes(ListNode head) {
   //      int sum=0;
   //  ListNode dummy=new ListNode(-1);
   //      ListNode l1=head;
   //      ListNode l2=head;
   //      ListNode d=dummy;
   //      l2=l2.next;
   // while(l2.next!=null){ 
   //     if(l1.val==0 && l2.val!=0){
   //         sum+=l2.val;
   //         l2=l2.next;
   //     }else{
   //         d.next=new ListNode(sum);
   //         d=d.next;
   //         l1=l2;
   //         l2=l2.next;
   //         sum=0;   
   //     }  
   // }
   //      return d;   
   //  }
   public ListNode mergeNodes(ListNode head){
ListNode temp = head, temp2 = head.next;
     int sum=0;
      while(temp2!=null){
            if(temp2.val==0){ 
                temp.next.val=sum; 
                temp.next.next=temp2.next;  
                temp=temp.next; 
                sum=0; 
           }
            sum+=temp2.val; 
            temp2=temp2.next;
        }
        return head.next; 
    }
}