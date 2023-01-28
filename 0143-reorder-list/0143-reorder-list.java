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
      static ListNode rev(ListNode head){
          ListNode prev = null;
           ListNode current = head;
            ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;
        secondHalf = rev(secondHalf);
        ListNode firstHalf = head;
        while (secondHalf != null) {
            ListNode firstHalfNext = firstHalf.next;
            ListNode secondHalfNext = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = firstHalfNext;
            firstHalf = firstHalfNext;
            secondHalf = secondHalfNext;
        }
    }
}