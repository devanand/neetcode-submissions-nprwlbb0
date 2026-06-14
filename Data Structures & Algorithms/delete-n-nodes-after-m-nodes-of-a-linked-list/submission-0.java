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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        for (ListNode current = head; current != null;) {
            for (int i = 0; i < m - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                return head;
            }
            ListNode afterSkip = current.next;
            for (int i = 0; i < n && afterSkip != null; i++) {
                afterSkip = afterSkip.next;
            }
            current.next = afterSkip;
            current = afterSkip;
        }
        return head;
    }
}
