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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)
            return null;
        if(k == 1)
            return head;
        ListNode h = head;
        int n = 0;
        while(h != null)
        {
            n++;
            h = h.next;
        }
        ListNode prev = null, curr = head, next;
        ListNode newHead = null;
        ListNode t1 = null;
        ListNode t2 = head;
        while(n>=k)
        {
            for(int i = 0; i < k; i++)
            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if(newHead == null)
            newHead = prev;
            if(t1 != null)
                t1.next = prev;
            t2.next = curr;
            t1 = t2;
            prev = null;
            t2 = curr;
            n -= k;
                
        }
        return newHead;
        
    }
}