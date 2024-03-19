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
    public ListNode oddEvenList(ListNode head) {
        // we check if there are at least three nodes in the list
        // if there are only two nodes, then first node is even and second node is odd
        // if only one node, then first node is odd 
        // so just return head
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        
        // odd is at head
        ListNode odd = head;
        // make second node as even
        ListNode even = head.next;
        // keep a pointer evenhead at even. This will not be changed.
        ListNode evenHead = even;
        
        // we have to move odd to next of even
        // so we check is even.next is null of even is null
        while (even != null && even.next != null) {
            // if not, then make odd.next point to even.next
            odd.next = even.next;
            // move odd to odd.next
            odd = odd.next;
            // even.next to odd.next
            even.next = odd.next;
            // move even to even.next
            even = even.next;
        }

        // at this point we have connected all the even nodes together, and all odd nodes together
        // now we connect the odd nodes, and even nodes
        odd.next = evenHead;
        return head;
    }
}