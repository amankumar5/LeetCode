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
    public ListNode reverseList(ListNode head) {
        ListNode h1=head;
        ListNode pre=null;
        while(h1!=null)
        {
            ListNode temp=h1.next;
            h1.next=pre;
            pre = h1;
            h1 = temp;
        }
        return pre;
    }
}