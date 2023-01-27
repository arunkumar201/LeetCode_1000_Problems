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
    public void reorderList(ListNode head) {
       Stack<ListNode> st=new Stack<>();
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
            len++;
            
        }
        ListNode l=head;
        for(int i=0;i<(len/2);i++){
            ListNode t=st.pop();
            ListNode x=l.next;
            l.next=t;
            t.next=x;
            l=x;    
        }
        l.next=null;     
    }
}