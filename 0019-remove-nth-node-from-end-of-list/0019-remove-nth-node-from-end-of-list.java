// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if (head == null || head.next == null) {
//             return null;
//         }

//         int size = 0;
//         ListNode curr = head;

//         while (curr != null) {
//             size++;
//             curr = curr.next;
//         }

//         int pos = size - n;

//         if (pos == 0) {
//             return head.next;
//         }

//         ListNode prev = null;
//         curr = head;

//         for (int i = 0; i < pos; i++) {
//             prev = curr;
//             curr = curr.next;
//         }

//         prev.next = curr.next;

//         return head;
//     }
// }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return head.next;
        }
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        int pos = size - n;
        if (pos == 0) {
            return head.next;
        }
        curr = head;
        ListNode prev = null;
        for (int i = 0; i < pos; i++) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        return head;
    }
}