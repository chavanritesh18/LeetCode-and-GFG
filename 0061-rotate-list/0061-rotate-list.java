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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null)
        {
            return null;
        }

        int size  = 0;

        ListNode curr =  head;

        while( curr.next != null)
        {
            size++;
            curr = curr.next;

        }

        size+=1;

        curr.next =  head; // Tail is connected to head

        k =  k  % size;  // if k is greater than the size

        curr  =  head;  // assining head to the curr node


        for(int i  = 1 ; i < size - k; i++) // loop will be up to size  - k 
        {
            curr  = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next =  null;

        return newHead;
    }
}