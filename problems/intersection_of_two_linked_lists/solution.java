/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A1 =headA;
        int lenA = 0;
        int lenB = 0;
        while(A1.next!=null)
        {
            lenA++;
            A1=A1.next;
        }
        A1=headB;
         while(A1.next!=null)
        {
            lenB++;
            A1=A1.next;
        }
        ListNode A= new ListNode();
        ListNode B= new ListNode();
        A.next=headA;
         B.next =headB;
        if(lenA > lenB)
        {
            int dif = lenA-lenB;
            while(dif>0){
                A=A.next;
                dif--;
            }
        }
            if(lenA < lenB)
        {
            int dif = lenB-lenA;
            while(dif>0){
                B=B.next;
                dif--;
            }
        }
        while(A.next!=null)
        {
            if(A.next ==B.next)
                return A.next;
            else{
                A = A.next;
                B = B.next;
            }
        }
        return null;
        
    }
}