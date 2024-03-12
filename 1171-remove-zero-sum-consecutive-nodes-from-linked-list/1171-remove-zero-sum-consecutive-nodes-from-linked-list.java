/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   public ListNode removeZeroSumSublists(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = dummy;
    int sum = 0;
    HashMap<Integer, ListNode> map = new HashMap<>();
    
    while (cur != null) {
        sum += cur.val;
        map.put(sum, cur);
        cur = cur.next;
    }

    sum = 0;
    cur = dummy;
    while (cur != null) {
        sum += cur.val;
        if (map.containsKey(sum)) {
            cur.next = map.get(sum).next;
        }
        cur = cur.next;
    }

    return dummy.next;
}


}