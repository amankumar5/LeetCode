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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
    ListNode prev = null;
    int carry = 0;
    while (l1 != null && l2 != null) {
        final int sum = l1.val + l2.val + carry;
        ListNode cur = new ListNode(sum % 10);
        carry = sum / 10;
        if (head == null) {
            head = cur;
        } else {
            prev.next = cur;
        }
        l1 = l1.next;
        l2 = l2.next;
        prev = cur;
    }
    ListNode remaining = l1 == null ? l2 : l1;
    while (remaining != null) {
        int sum = remaining.val + carry;
        ListNode cur = new ListNode(sum % 10);
        carry = sum / 10;
        prev.next = cur;
        remaining = remaining.next;
        prev = cur;
    }
    if (carry > 0) {
        prev.next = new ListNode(carry);
    }
    return head;
    }
}