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
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode dummyNode = new ListNode(0);
     
    ListNode tail = dummyNode;
    while(true)
    {
        if(l1 == null)
        {
            tail.next = l2;
            break;
        }
        if(l2 == null)
        {
            tail.next = l1;
            break;
        }
         
        if(l1.val <= l2.val)
        {
            tail.next = l1;
            l1 = l1.next;
        }
        else
        {
            tail.next = l2;
            l2 = l2.next;
        }
         
        
        tail = tail.next;
    }
    return dummyNode.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int len=lists.length;
        ListNode ansList= new ListNode(Integer.MIN_VALUE);
        for(int i=0;i<len;i++)
        {
            ansList = mergeTwoLists(ansList,lists[i]);
        }
        return ansList.next;
        
    }
}