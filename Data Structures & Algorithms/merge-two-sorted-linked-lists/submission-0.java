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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1, null);
        ListNode resultSentinel = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                resultSentinel.next = new ListNode(list1.val, null);
                list1 = list1.next;
            } else {
                resultSentinel.next = new ListNode(list2.val, null);
                list2 = list2.next;
            }
            resultSentinel = resultSentinel.next;
        }
        while (list1 != null) {
            resultSentinel.next = new ListNode(list1.val, null);
            list1 = list1.next;
            resultSentinel = resultSentinel.next;
        }

        while (list2 != null) {
            resultSentinel.next = new ListNode(list2.val, null);
            list2 = list2.next;
            resultSentinel = resultSentinel.next;
        }
        return result.next;
    }
}