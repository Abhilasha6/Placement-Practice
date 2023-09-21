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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode curr = head;
        int c = 0;
        while (curr != null) {
            c++;
            curr = curr.next;
        }
        curr = head;
        int mid = c / 2;
        while (mid-- > 1) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}