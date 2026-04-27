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
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode output = sentinel.next;
        ListNode prev = sentinel;
        while (output != null) {
            if (output.val == val) {
                prev.next = output.next;
                output.next = null;
                output = prev.next;
            } else {
                prev = output;
                output = output.next;
            }
        }
        return sentinel.next;
    }
}