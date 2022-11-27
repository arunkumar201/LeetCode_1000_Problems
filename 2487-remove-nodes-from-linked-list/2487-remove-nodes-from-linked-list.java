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
    public ListNode removeNodes(ListNode head) {
        
        Stack<ListNode> st=new Stack<>();
        ListNode dummy=new ListNode(Integer.MAX_VALUE);
        ListNode curr=head;
          st.push(dummy);
        while(!st.isEmpty() && curr!=null){ 
            while(!st.isEmpty() && curr.val>st.peek().val){
                st.pop();
            }
            st.peek().next=curr;
            st.push(curr);
            curr=curr.next;
        }
        return dummy.next;
    }
}