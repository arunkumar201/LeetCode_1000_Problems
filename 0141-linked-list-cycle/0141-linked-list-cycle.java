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
   
 public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ArrayList<ListNode> li=new ArrayList<ListNode>();
        ListNode temp=head;
        while (temp!=null) {
            if(li.contains(temp)){
                return true;
            }else {
                li.add(temp);
            }
            temp=temp.next;
        }
        return false;
    }
}