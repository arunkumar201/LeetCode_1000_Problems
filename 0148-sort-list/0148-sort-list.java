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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;   
        ArrayList<Integer> li=new ArrayList<>();
        ListNode t=head;
        while(t!=null){
            li.add(t.val);
            t=t.next;
        }
        Collections.sort(li);    
       ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
      int j=0;
      for(int i:li)  {
            ListNode t1=new ListNode(i);
            temp.next=t1;
            temp=t1;
        }
        
        return dummy.next;
    }
}